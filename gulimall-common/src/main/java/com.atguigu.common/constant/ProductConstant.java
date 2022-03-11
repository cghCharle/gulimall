package com.atguigu.common.constant;

/**
 * @Description TDDO
 * @Version 1.0
 * <p>
 * Author chenguanhua
 * 学号 3187102348
 * @Date 2022/2/28 10:57 AM
 */
public class ProductConstant {
    public enum AttrEnum{
        ATTR_TYPE_BASE(0,"基础属性"),
        ATTR_TYPE_SALE(1,"销售属性");
        private int code;
        private String msg;

        AttrEnum(int code, String msg) {
            this.code = code;
            this.msg = msg;
        }

        public int getCode() {
            return code;
        }
    }
}
