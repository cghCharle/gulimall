package com.atguigu.gulimall.product.vo;

import lombok.Data;

/**
 * @Description TDDO
 * @Version 1.0
 * <p>
 * Author chenguanhua
 * 学号 3187102348
 * @Date 2022/2/28 9:33 AM
 */
@Data
public class AttrRespVo extends AttrGroupVo{
    private String catelogName;
    private String groupName;
    private Long[] catelogPath;
}
