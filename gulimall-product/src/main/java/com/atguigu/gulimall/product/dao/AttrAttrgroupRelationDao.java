package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.AttrAttrgroupRelationEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 属性&属性分组关联
 *
 * @author chenguanhua
 * @email 524558711@qq.com
 * @date 2022-02-16 15:49:29
 */
@Mapper
public interface AttrAttrgroupRelationDao extends BaseMapper<AttrAttrgroupRelationEntity> {

    void deleteBatchRelations(@Param("collect") List<AttrAttrgroupRelationEntity> collect);
}
