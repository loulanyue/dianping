package com.yfy.dianping.common;

/**
 * @author youfy
 * @date 2020-02-22 13:45分
 * @blame 1
 */

public enum EmBusinessError {
    //通用的错误类型10000开头
    NO_OBJECT_FOUND(10001, "请求对象不存在"),
    UNKNOWN_ERROR(10002, "未知异常"),
    NO_HANDLE_FOUND(10003, "找不到执行的路径操作"),
    BIND_EXCEPTION_ERROR(10004, "请求参数错误"),

    ;

    private Integer errCode;

    private String errMsg;

    EmBusinessError(Integer errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}