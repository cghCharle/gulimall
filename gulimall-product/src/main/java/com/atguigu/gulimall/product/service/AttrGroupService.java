package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.vo.WithAttrVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.AttrGroupEntity;

import java.util.List;
import java.util.Map;

/**
 * 属性分组
 *
 * @author chenguanhua
 * @email 524558711@qq.com
 * @date 2022-02-16 15:49:29
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageUtils queryPage(Map<String, Object> params);

    PageUtils queryPage(Map<String, Object> params, Long catelogId);

    PageUtils getNoRelationAttr(Long attrgroupId, Map<String, Object> params);

    List<WithAttrVo> queryWithAttrByCatelogId(Long catelogId);
}

