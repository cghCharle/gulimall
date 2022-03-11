package com.atguigu.gulimall.product.vo;

/**
 * @Description TDDO
 * @Version 1.0
 * <p>
 * Author chenguanhua
 * 学号 3187102348
 * @Date 2021/12/27 9:32 AM
 */
public class AttrRelationVo {
    private Long attrId;
    private Long attrGroupId;

    public Long getAttrId() {
        return attrId;
    }

    public void setAttrId(Long attrId) {
        this.attrId = attrId;
    }

    public Long getAttrGroupId() {
        return attrGroupId;
    }

    public void setAttrGroupId(Long attrGroupId) {
        this.attrGroupId = attrGroupId;
    }

    public AttrRelationVo() {
    }

    public AttrRelationVo(Long attrId, Long attrGroupId) {
        this.attrId = attrId;
        this.attrGroupId = attrGroupId;
    }
}
