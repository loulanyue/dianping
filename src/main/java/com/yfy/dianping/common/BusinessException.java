package com.yfy.dianping.common;

/**
 * @author youfy
 * @date 2020-02-22 13:51分
 * @blame 1
 */
public class BusinessException extends Exception {
    private CommonError commonError;

    public BusinessException(EmBusinessError emBusinessError){
        super();
        this.commonError = new CommonError(emBusinessError);
    }

    public CommonError getCommonError() {
        return commonError;
    }

    public void setCommonError(CommonError commonError) {
        this.commonError = commonError;
    }
}
