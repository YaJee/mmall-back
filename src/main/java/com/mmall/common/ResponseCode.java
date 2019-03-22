package com.mmall.common;


/**
 * Created by yajie on 2019/3/17.
 */
public enum ResponseCode {
    //将下边这些枚举全部 分别 构成成了 ResponseCode对象
    //使用：ResponseCode.SUCCESS.getCode();
    SUCCESS(0,"SUCCESS"),
    ERROR(1,"ERROR"),
    NEED_LOGIN(10,"NEED_LOGIN"),
    ILLEGAL_ARGUMENT(2,"ILLEGAL_ARGUMENT");

    private final int code;
    private final String desc;


    ResponseCode(int code,String desc){
        this.code = code;
        this.desc = desc;
    }

    public int getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }
}
