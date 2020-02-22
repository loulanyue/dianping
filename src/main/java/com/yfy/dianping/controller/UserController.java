package com.yfy.dianping.controller;

import com.yfy.dianping.common.BusinessException;
import com.yfy.dianping.common.CommonError;
import com.yfy.dianping.common.CommonRes;
import com.yfy.dianping.common.EmBusinessError;
import com.yfy.dianping.model.UserModel;
import com.yfy.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author youfy
 * DATE 2020/2/22
 */

@Controller("/user")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    @ResponseBody
    public String test() {
        return "test";
    }


    @RequestMapping("/get")
    @ResponseBody
    public CommonRes getUser(@RequestParam(name = "id") Integer id) throws BusinessException {
        UserModel userModel = userService.getUser(id);
        if (userModel == null) {
            throw new BusinessException(EmBusinessError.NO_OBJECT_FOUND);
            //return CommonRes.create(new CommonError(EmBusinessError.NO_OBJECT_FOUND), "fail");
        } else {
            return CommonRes.create(userModel);
        }
    }

    @RequestMapping("/index")
    public ModelAndView index(){
        String userName = "yfy";
        ModelAndView modelAndView = new ModelAndView("/index.html");
        modelAndView.addObject("name",userName);
        return modelAndView;
    }
}
