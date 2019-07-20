package com.fashion.mjysite.controller;

import com.alibaba.fastjson.JSONObject;
import com.fashion.mjysite.entity.Article;
import com.fashion.mjysite.service.ArticleService;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;
//    @RequiresRoles("管理员")
    @RequestMapping("/getarticle")
    @ResponseBody
    public JSONObject getArticle(@RequestParam(value = "page", required = false) Integer page, @RequestParam(value = "limit", required = false) Integer limit){
        PageInfo<Article> pageInfo = articleService.getArticle(page, limit);
        JSONObject result = new JSONObject();
//        System.out.println(page + limit);
        result.put("code", 0);
        result.put("msg", "success");
        result.put("count", pageInfo.getTotal());
        result.put("data", pageInfo.getList());
        return result;
    }
//    public List<Article> getArticle2(Integer page, Integer limit){
//
//        PageInfo<Article> pageInfo = articleService.getArticle(page, limit);
//        return articleList;
//    }
    @RequestMapping("/editarticle")
    @ResponseBody
    public String ediArticle(@RequestParam(value = "article", required = false) String article, @RequestParam(value = "sid", required = true) Integer sid){
        //JSONObject result = new JSONObject();
        articleService.updateArticle(article, sid);
        //result.put("res", "ok");
        return "success";
    }
    @RequestMapping("/delarticle")
    @ResponseBody
    public String delArticle(Long sid){
        articleService.delArticle(sid);
        //简单处理,后续加入try catch模块以便不中断系统
        return "success";
    }
}
