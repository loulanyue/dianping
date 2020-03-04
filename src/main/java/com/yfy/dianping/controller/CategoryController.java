package com.yfy.dianping.controller;

import com.yfy.dianping.common.CommonRes;
import com.yfy.dianping.model.CategoryModel;
import com.yfy.dianping.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author youfy
 * @date 2020-03-01 0:50分
 */
@Controller("/category")
@RequestMapping("/category")
public class CategoryController {

    @Resource
    private CategoryService categoryService;

    @ResponseBody
    @RequestMapping("/list")
    public CommonRes list() {
        List<CategoryModel> categoryModelList = categoryService.selectAll();
        return CommonRes.create(categoryModelList);
    }
}
