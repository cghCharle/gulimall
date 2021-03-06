package com.atguigu.gulimall.product.service;

import com.atguigu.gulimall.product.vo.SpuSaveVo;
import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.common.utils.PageUtils;
import com.atguigu.gulimall.product.entity.SpuInfoEntity;

import java.util.Map;

/**
 * spu信息
 *
 * @author chenguanhua
 * @email 524558711@qq.com
 * @date 2022-02-16 15:49:29
 */
public interface SpuInfoService extends IService<SpuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void saveInfo(SpuSaveVo vo);
}

