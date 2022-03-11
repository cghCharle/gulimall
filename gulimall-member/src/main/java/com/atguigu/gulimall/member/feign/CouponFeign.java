package com.atguigu.gulimall.member.feign;

import com.atguigu.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description TODO
 * @Version 1.0
 * @Author chenguanhua
 * 学号：3187102348
 * @Date 2021/12/11 1:38 PM
 */
@FeignClient("gulimall-coupon")
public interface CouponFeign {
    @RequestMapping("gulimallcoupon/smscoupon/member/list")
    public R memberCoupons();
}
