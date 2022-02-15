package com.atguigu.common.constant;

/**
 * @Description TDDO
 * @Version 1.0
 * <p>
 * Author chenguanhua
 * 学号 3187102348
 * @Date 2021/12/28 2:52 PM
 */
public enum WareEnum {
    CREATED(0,"新建"),
    ASSIGNED(1,"已分配"),
    RECEIVE(2,"已领取"),
    FINISH(3,"已完成"),
    HASERROR(4,"有异常");

    private Integer code;
    private String message;

    WareEnum(Integer code, String message) {
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

    WareEnum() {
    }
}
