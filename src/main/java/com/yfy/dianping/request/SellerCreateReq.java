package com.yfy.dianping.request;

import javax.validation.constraints.NotBlank;

/**
 * @author youfy
 * @date 2020-02-28 19:57分
 */
public class SellerCreateReq {

    @NotBlank(message = "商户名不能为空")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
