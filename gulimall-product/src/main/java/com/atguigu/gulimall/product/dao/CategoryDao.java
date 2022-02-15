package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author chenguanhua
 * @email 524558711@qq.com
 * @date 2022-02-15 15:21:53
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
