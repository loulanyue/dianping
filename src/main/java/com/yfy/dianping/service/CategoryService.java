package com.yfy.dianping.service;

import com.yfy.dianping.common.BusinessException;
import com.yfy.dianping.model.CategoryModel;

import java.util.List;

/**
 * @author youfy
 * @date 2020-02-29 23:30分
 */
public interface CategoryService {

    CategoryModel create (CategoryModel categoryModel) throws BusinessException;

    CategoryModel get(Integer id);

    List<CategoryModel> selectAll();

    Integer countAllCategory();
}
