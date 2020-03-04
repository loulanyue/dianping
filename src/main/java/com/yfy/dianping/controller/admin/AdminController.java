package com.yfy.dianping.controller.admin;

import com.yfy.dianping.common.AdminPermission;
import com.yfy.dianping.common.BusinessException;
import com.yfy.dianping.common.EmBusinessError;
import com.yfy.dianping.service.CategoryService;
import com.yfy.dianping.service.SellerService;
import com.yfy.dianping.service.ShopService;
import com.yfy.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;
import sun.misc.BASE64Encoder;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author youfy
 * @date 2020-02-28 17:51分
 */

@Controller("/admin/admin")
@RequestMapping("/admin/admin")
public class AdminController {

    @Value("${admin.email}")
    private String email;

    @Value("${admin.encryptPassword}")
    private String encryptPassword;

    @Resource
    private HttpServletRequest httpServletRequest;

    @Resource
    private UserService userService;

    @Resource
    private CategoryService categoryService;

    @Resource
    private SellerService sellerService;

    @Resource
    private ShopService shopService;

    public static final String CURRENT_ADMIN_SESSION = "currentAdminSession";

    @RequestMapping("/index")
    @AdminPermission
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("/admin/admin/index");
        Integer i = userService.countAllUser();
        System.out.println(i);
        modelAndView.addObject("shopCount", shopService.countAllShop());
        modelAndView.addObject("categoryCount", categoryService.countAllCategory());
        modelAndView.addObject("sellerCount", sellerService.countAllSeller());
        modelAndView.addObject("userCount", userService.countAllUser());
        modelAndView.addObject("CONTROLLER_NAME", "admin");
        modelAndView.addObject("ACCTION_NAME", "index");

        return modelAndView;
    }

    @RequestMapping("/loginpage")
    public ModelAndView loginpage() {
        ModelAndView modelAndView = new ModelAndView("/admin/admin/login");
        return modelAndView;
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(name = "email") String email, @RequestParam(name = "password") String password) throws BusinessException, UnsupportedEncodingException, NoSuchAlgorithmException {
        if (StringUtils.isEmpty(email) || StringUtils.isEmpty(password)) {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, "用户名密码不能为空");
        }
        if (email.equals(this.email) && encodeByMd5(password).equals(this.encryptPassword)) {
            //登录成功
            httpServletRequest.getSession().setAttribute(CURRENT_ADMIN_SESSION, email);
            return "redirect:/admin/admin/index";
        } else {
            throw new BusinessException(EmBusinessError.PARAMETER_VALIDATION_ERROR, "用户名密码错误");
        }
    }

    private String encodeByMd5(String str) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        //确定计算方法MD5
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return base64Encoder.encode(messageDigest.digest(str.getBytes("utf-8")));
    }
}