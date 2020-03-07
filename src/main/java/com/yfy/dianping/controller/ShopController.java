package com.yfy.dianping.controller;

import com.yfy.dianping.common.BusinessException;
import com.yfy.dianping.common.CommonRes;
import com.yfy.dianping.common.EmBusinessError;
import com.yfy.dianping.model.ShopModel;
import com.yfy.dianping.service.CategoryService;
import com.yfy.dianping.service.ShopService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.util.StringUtils;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author youfy
 * @date 2020-03-07 14:24分
 */
@Controller("/shop")
@RequestMapping("/shop")
public class ShopController {

    @Resource
    private ShopService shopService;

    @Resource
    private CategoryService categoryService;

    /**
     * 推进服务v1.0
     */
    @RequestMapping("/recommend")
    @ResponseBody
    public CommonRes recommend(@RequestParam(name = "longitude") BigDecimal longitude,
                               @RequestParam(name = "latitude") BigDecimal latitude) throws BusinessException {
        if (longitude == null || latitude == null) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        List<ShopModel> shopModelList = shopService.recommend(longitude, latitude);
        return CommonRes.create(shopModelList);
    }
    /**
     * 搜索服务v1.0
     */
    @RequestMapping("/search")
    @ResponseBody
    public CommonRes search(@RequestParam(name="longitude")BigDecimal longitude,
                            @RequestParam(name="latitude")BigDecimal latitude,
                            @RequestParam(name="keyword")String keyword) throws BusinessException {
        if(StringUtils.isEmpty(keyword)||longitude==null||latitude==null){
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR);
        }

        List<ShopModel> shopModelList=shopService.search(longitude,latitude,keyword);
        Map<String,Object> resMap = new HashMap<>(2);
        resMap.put("shop",shopModelList);
        return CommonRes.create(resMap);
    }

}
