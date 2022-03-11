package com.atguigu.gulimall.product.service.impl;

import com.atguigu.gulimall.product.entity.CategoryBrandRelationEntity;
import com.atguigu.gulimall.product.service.CategoryBrandRelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.common.utils.Query;

import com.atguigu.gulimall.product.dao.CategoryDao;
import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.atguigu.gulimall.product.service.CategoryService;
import org.springframework.transaction.annotation.Transactional;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {
    @Autowired
    CategoryBrandRelationService categoryBrandRelationService;
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        List<CategoryEntity> collect = entities.stream()
                .filter((item) -> item.getParentCid()==0)
                .map((menu)->{
                    menu.setChildren(getChildrens(menu,entities));
                    return menu;
                }).sorted((menu1,menu2)->{return (menu1.getSort()==null?0:menu1.getSort())-(menu2.getSort()==null?0:menu2.getSort());})
                .collect(Collectors.toList());
        return collect;
    }

    @Override
    public void removeBatchByIds(List<Long> asList) {
        // TODO 检查当前菜单是否被引用
         baseMapper.deleteBatchIds(asList);
    }

    @Override
    public Long[] finCategoryPath(Long catelogId) {
        List<Long> paths = new ArrayList<>();
        List<Long> categoryParent = findCategoryParent(catelogId, paths);
        Collections.reverse(categoryParent);
        return paths.toArray(new Long[paths.size()]);
    }
    @Transactional
    @Override
    public void updateCascade(List<CategoryEntity> asList) {
        this.updateBatchById(asList);
//        List<CategoryBrandRelationEntity> collect = asList.stream().map((item) -> {
//            CategoryBrandRelationEntity relation = new CategoryBrandRelationEntity();
//            relation.setBrandId(item.getCatId());
//            relation.setBrandName(item.getName());
//            return relation;
//        }).collect(Collectors.toList());
        for (CategoryEntity e:asList
             ) {
            CategoryBrandRelationEntity relationEntity = new CategoryBrandRelationEntity();
            relationEntity.setBrandName(e.getName());
            relationEntity.setBrandId(e.getCatId());
            categoryBrandRelationService.updateCategory(relationEntity.getBrandId(),relationEntity.getBrandName());
        }

    }

    private List<Long> findCategoryParent(Long catelogId, List<Long> paths){
        paths.add(catelogId);
        CategoryEntity byId = this.getById(catelogId);
        if (byId.getParentCid() != 0){
            Long parentCid = byId.getParentCid();
            findCategoryParent(parentCid,paths);
        }
        return paths;
    }

    private List<CategoryEntity> getChildrens(CategoryEntity category,List<CategoryEntity> entities){
        List<CategoryEntity> collect = entities.stream()
                .filter(categoryEntity -> {
                    return categoryEntity.getParentCid() == category.getCatId();
                }).map(menu -> {
                    menu.setChildren(getChildrens(menu, entities));
                    return menu;
                }).sorted((menu1, menu2) -> {
                    return (menu1.getSort() == null ? 0 : menu1.getSort()) - (menu2.getSort() == null ? 0 : menu2.getSort());
                }).collect(Collectors.toList());
        return collect;
    }

}
