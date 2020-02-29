package com.yfy.dianping.request;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @author youfy
 * @date 2020-02-29 23:46分
 */
@Getter
@Setter
public class CategoryCreateReq {
    @NotBlank(message = "名字不能为空")
    private String name;
    @NotBlank(message = "iconUrl不能为空")
    private String iconUrl;
    @NotNull(message = "权重不能为空")
    private Integer sort;
}
