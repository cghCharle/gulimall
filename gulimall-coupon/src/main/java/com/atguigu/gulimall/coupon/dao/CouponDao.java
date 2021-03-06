package com.atguigu.gulimall.coupon.dao;

import com.atguigu.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author chenguanhua
 * @email 524558711@qq.com
 * @date 2022-02-15 16:03:05
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
