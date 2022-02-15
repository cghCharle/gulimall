package com.atguigu.common.constant;

/**
 * @Description TDDO
 * @Version 1.0
 * <p>
 * Author chenguanhua
 * 学号 3187102348
 * @Date 2021/12/27 10:45 AM
 */
public enum AttrEnum {
    ATTR_TYPE_BASE(0,"基础属性"),
    ATTR_TYPE_SALE(1,"销售属性");
    private Integer code;
    private String message;

    AttrEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    AttrEnum() {
    }
}
