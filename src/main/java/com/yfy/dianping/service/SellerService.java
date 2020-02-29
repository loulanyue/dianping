package com.yfy.dianping.service;

import com.yfy.dianping.common.BusinessException;
import com.yfy.dianping.model.SellerModel;
import com.yfy.dianping.model.UserModel;

import java.util.List;


public interface SellerService {

    SellerModel create(SellerModel sellerModel);

    SellerModel get(Integer id);

    List<SellerModel> selectAll();

    SellerModel changeStatus(Integer id,Integer disabledFlag) throws BusinessException;

    Integer countAllSeller();
}
