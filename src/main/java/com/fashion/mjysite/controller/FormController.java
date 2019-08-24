package com.fashion.mjysite.controller;

import com.alibaba.fastjson.JSONObject;
import com.fashion.mjysite.entity.*;
import com.fashion.mjysite.service.FormService;
import com.fashion.mjysite.util.RestResponse;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/form")
public class FormController {
    @Autowired
    private FormService formService;
//    @RequestMapping("/creatformcode")
//    @ResponseBody
//    public String createFormCode(String dept){
//         return formService.createFormCode(dept, "PR");
//    }
    @RequestMapping("/createform")
    @ResponseBody
    public JSONObject prForm(HttpServletRequest request, Form prform){
        JSONObject jb = new JSONObject();
        String formCode = null;
        try {
            //String[] fileatta = request.getParameterValues("fileatta");
            //StringBuilder sb = new StringBuilder();
            //写入form表detail及附件 便于事务管理集中
            formCode = formService.createSignForm(request,prform);
            //formService.insertForm(prform);
            //formService.insertFormDetail(formDetailList);
            //写入附件
            //formService.insertAtta(attaList);
            if(formCode.contains("pr".toUpperCase())){
                jb.put("data", "success");
                jb.put("formcode", formCode);
            }else{
                jb.put("data", "faild");
                jb.put("formcode", formCode);
            }

        }catch (Exception ex){
            jb.put("data", ex);
            jb.put("formcode", formCode);
            return jb;
        }
        return jb;
//        response.setContentType("text/html; charset=UTF-8"); //转码
//        PrintWriter out = response.getWriter();
//        out.flush();
//        out.println("<script>alert('提交成功！');history.back();</script>");
//        out.close();
        /*for (int i = 0;i < fileatta.length; i++){
            if(i > 0) {
                sb.append(";"+fileatta[i] );
            }else{
                sb.append(fileatta[i]);
            }
        }*/
        //costform.setAttaurl(sb.toString());
    }
    @RequestMapping("/selectFormList")
    @ResponseBody
    public JSONObject selectFromList(HttpServletRequest request, @RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "limit", required = false) Integer limit){
        String formtype = request.getParameter("formtype");
        JSONObject jb = new JSONObject();
        PageInfo<Form> formPageInfo = new PageInfo<Form>();
        try {
            formPageInfo = formService.selectFromList(page, limit, formtype);
            jb.put("code", 0);
            jb.put("msg", "success");
            jb.put("count", formPageInfo.getTotal());
            jb.put("data", formPageInfo.getList());
        }catch (Exception ex){
            jb.put("data", ex);
            return jb;
        }
        return jb;
    }
    @RequestMapping("/getFormSum")
    @ResponseBody
    public JSONObject getFormSum(){
        JSONObject jb = new JSONObject();
        List<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
        User user = (User)SecurityUtils.getSubject().getPrincipal();
        try {
            maps = formService.getFormSum(user.getUsername());
            jb.put("result", "success");
            jb.put("data",maps);
        }catch (Exception ex){
            jb.put("result", ex);
            jb.put("data","");
            return jb;
        }finally {
            return jb;
        }
    }
    @RequestMapping("/forminfor/{signview}")
    public ModelAndView getFormInfor(HttpServletRequest request,@PathVariable(name = "signview",required = false)String signview){
        String formcode = request.getParameter("formcode");
        List<Form> formList = formService.getFormInfor(formcode);
        ModelAndView mv = new ModelAndView("forminfor");
        mv.addObject("formList", formList);
        mv.addObject("view", signview);
        return mv;
    }
    @RequestMapping("/getSignHistory")
    @ResponseBody
    public JSONObject getSignHistory(HttpServletRequest req){
        JSONObject jb = new JSONObject();
        String formCode = req.getParameter("formcode");
        List<Sign> signList = formService.getSignHistory(formCode);
        jb.put("code", 0);
        jb.put("msg", "success");
        jb.put("count", signList.size());
        jb.put("data", signList);
        return jb;
    }
    @RequestMapping("/agreeSign")
    @ResponseBody
    public JSONObject agreeSign(HttpServletRequest request){
        JSONObject jb = new JSONObject();
        String formCode = request.getParameter("formcode");
        String signremark = request.getParameter("signremark");
        formService.agreeSign(formCode, signremark);
        jb.put("data","success");
        return jb;
    }
    @RequestMapping("/disagreeSign")
    @ResponseBody
    public JSONObject disagreeSign(HttpServletRequest req){
        JSONObject jb = new JSONObject();
        String formCode = req.getParameter("formcode");
        String signremark = req.getParameter("signremark");
        formService.disagreeSign(formCode, signremark);
        jb.put("data", "success");
        return jb;
    }
}
