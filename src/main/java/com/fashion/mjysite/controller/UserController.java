package com.fashion.mjysite.controller;

import com.alibaba.fastjson.JSONObject;
import com.fashion.mjysite.entity.User;
import com.fashion.mjysite.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController{
    @Autowired
    private UserService userService;
//    @RequiresRoles("管理员")
    @RequestMapping("/userInfor")
    public ModelAndView getUserInfor(){
        ModelAndView mv = new ModelAndView("user/userInfor");
        User user = (User) SecurityUtils.getSubject().getPrincipal();
        mv.addObject("user", user);
        return mv;
    }
    @RequestMapping("/changepwd")
    @ResponseBody
    public String changePwd(String username, String password){
        try {
            userService.changePwd(username, password);
        }catch (Exception ex){
            return "fail";
        }
        return "success";
    }
}
