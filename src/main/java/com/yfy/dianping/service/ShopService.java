package com.yfy.dianping.service;

import com.yfy.dianping.common.BusinessException;
import com.yfy.dianping.model.ShopModel;

import java.math.BigDecimal;
import java.util.List;

/**
 * @author youfy
 * @date 2020-03-01 1:10分
 */
public interface ShopService {

    ShopModel create(ShopModel shopModel) throws BusinessException;

    ShopModel get(Integer id);

    List<ShopModel> selectAll();

    Integer countAllShop();

    List<ShopModel> recommend(BigDecimal longitude,BigDecimal latitude);

    List<ShopModel> search(BigDecimal longitude,BigDecimal latitude,String keyword);
}
