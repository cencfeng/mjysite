package com.fashion.mjysite.controller;

import com.alibaba.fastjson.JSONObject;
import com.fashion.mjysite.entity.Menu;
import com.fashion.mjysite.entity.User;
import com.fashion.mjysite.service.MenuService;
import com.fashion.mjysite.service.UserService;
import com.fashion.mjysite.util.RestResponse;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.UnauthorizedException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/system")
public class SystemController {
    @Autowired
    private MenuService menuService;
    @Autowired
    private UserService userService;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/index")
    public String index(){
        return "system/index";
    }
    @RequestMapping("/indexs")
    @ResponseBody
    public RestResponse logining(String username, String password, HttpServletRequest request) {

        String rememberMe = request.getParameter("rememberMe");
        //, Boolean.valueOf(rememberMe)
        //token.setRememberMe(false);
        Map<String,Object> map = new HashMap<String, Object>();
        String error = null;
        HttpSession session = request.getSession();
        if(session == null){
            //return RestResponse.failure("session超时");
            return RestResponse.failure("session超时");
        }
        Subject subject = SecurityUtils.getSubject();

        //User user = (User)SecurityUtils.getSubject().getPrincipal()
//        UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword(),Boolean.valueOf(rememberMe));
        UsernamePasswordToken token = new UsernamePasswordToken(username, password,Boolean.valueOf(rememberMe));

        try {
            subject.login(token);
            //session.setAttribute("user", (User)subject.getPrincipal());
            map.put("url","/system/index");
        }catch (IncorrectCredentialsException e) {
            error = "登录密码错误.";
        } catch (ExcessiveAttemptsException e) {
            error = "登录失败次数过多";
        } catch (LockedAccountException e) {
            error = "帐号已被锁定.";
        } catch (DisabledAccountException e) {
            error = "帐号已被禁用.";
        } catch (ExpiredCredentialsException e) {
            error = "帐号已过期.";
        } catch (UnknownAccountException e) {
            error = "帐号不存在";
        } catch (UnauthorizedException e) {
            error = "您没有得到相应的授权！";
        }
        if(StringUtils.isEmpty(error)){
            return RestResponse.success("登录成功").setData(map);
        }else{
            return RestResponse.failure(error).setData("/system/login");
        }


        }

       /* if(user != null){
            model.addAttribute("user",user);
            return  "menu2";
        }*/
    @RequestMapping("/getMenuByUsername")
    @ResponseBody
    public List<Menu> getUserMenuByUsername() throws Exception{
        //System.out.println("11111");
        //User user = (User)session.getAttribute("user");
        List<Menu> menuList = new ArrayList<Menu>();
        User user = (User)SecurityUtils.getSubject().getPrincipal();//转换失败,spring-boot-devtools去掉,获取结果和reaml有关
//        System.out.println(user.getUsername());
        //执行sql语句太多,考虑加入redis缓存
        boolean hasMenu = redisTemplate.hasKey("beautiful_menu");
        List<Menu> list = new ArrayList<Menu>();
        if(hasMenu){
            menuList = (List<Menu>)redisTemplate.opsForList().range("beautiful_menu",0,-1).get(0);
        }else {
            menuList = menuService.getMenuByUsername(user.getUsername());
            if(!menuList.isEmpty()) {
                redisTemplate.opsForList().rightPush("beautiful_menu", menuList);
            }
        }
        return menuList;
    }
    @RequestMapping("/changepassword")
    public String changePassword(){
        return "user/changepassword";
    }
    @RequestMapping("/gettip")
    @ResponseBody
    public JSONObject getTip(){
        JSONObject jb = new JSONObject();
        String tip = userService.getTip();
        jb.put("data", tip);
        jb.put("status", "success");
        return jb;
//        String tip =  userService.getTip();
//        return tip;
    }
}
