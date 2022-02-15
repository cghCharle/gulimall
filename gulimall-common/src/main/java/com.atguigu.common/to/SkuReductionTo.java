package com.atguigu.common.to;

import lombok.Data;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Description TDDO
 * @Version 1.0
 * <p>
 * Author chenguanhua
 * 学号 3187102348
 * @Date 2021/12/28 9:42 AM
 */
@Data
public class SkuReductionTo {
    private long skuId;
    private int fullCount;
    private BigDecimal discount;
    private int countStatus;
    private BigDecimal fullPrice;
    private BigDecimal reducePrice;
    private int priceStatus;
    private List<MemberPrice> memberPrice;

}
