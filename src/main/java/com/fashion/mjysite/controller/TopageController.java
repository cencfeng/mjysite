package com.fashion.mjysite.controller;

import org.apache.shiro.authz.annotation.Logical;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
@RequiresRoles(value = {"ADMIN", "VIPUSER", "USER", "ACC", "ENG"}, logical = Logical.OR)
@RequestMapping("/topage")
public class TopageController {
//    多选一：logical = Logical.OR
//    例如：@RequiresPermissions(value = { "ADMIN", "VIPUSER" }, logical = Logical.OR)
//    必须全部符合：logical = Logical.AND
//    例如：@RequiresPermissions(value = { "ACC", "ENG" }, logical = Logical.AND)
    @RequestMapping(value = "{pageName1}")
    public ModelAndView toPage(@PathVariable("pageName1") String pageName1) {
        ModelAndView mv = new ModelAndView(pageName1);
        return mv;
    }
}
