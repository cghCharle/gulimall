package com.atguigu.gulimall.order.dao;

import com.atguigu.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author chenguanhua
 * @email 524558711@qq.com
 * @date 2022-02-15 16:15:19
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
