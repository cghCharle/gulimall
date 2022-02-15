package com.atguigu.common.to;

import java.math.BigDecimal;

/**
 * @Description TDDO
 * @Version 1.0
 * <p>
 * Author chenguanhua
 * 学号 3187102348
 * @Date 2021/12/28 9:19 AM
 */
public class SpuBoundTo {
    private BigDecimal buyBounds;
    private BigDecimal growBounds;
    private Long spuId;

    public SpuBoundTo() {
    }

    public SpuBoundTo(BigDecimal buyBounds, BigDecimal growBounds, Long spuId) {
        this.buyBounds = buyBounds;
        this.growBounds = growBounds;
        this.spuId = spuId;
    }

    public BigDecimal getBuyBounds() {
        return buyBounds;
    }

    public void setBuyBounds(BigDecimal buyBounds) {
        this.buyBounds = buyBounds;
    }

    public BigDecimal getGrowBounds() {
        return growBounds;
    }

    public void setGrowBounds(BigDecimal growBounds) {
        this.growBounds = growBounds;
    }

    public Long getSpuId() {
        return spuId;
    }

    public void setSpuId(Long spuId) {
        this.spuId = spuId;
    }
}
