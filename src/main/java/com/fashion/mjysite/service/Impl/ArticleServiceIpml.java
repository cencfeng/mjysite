package com.fashion.mjysite.service.Impl;

import com.fashion.mjysite.entity.Article;
import com.fashion.mjysite.mapper.ArticleMapper;
import com.fashion.mjysite.service.ArticleService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ArticleServiceIpml implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;
    @Override
    public PageInfo<Article> getArticle(Integer page, Integer limit) {
        PageHelper.startPage(page,limit);
        List<Article> articleList = articleMapper.selectAll();
        PageInfo<Article> pageInfo = new PageInfo<Article>(articleList);
        //有文章说此方式返回pageInfo.getTotal总条数第二次查询时总条数会显示错误,显示的是当前分页的总条数要使用以下方式
        //ps:调试时并未发现此类情况发生
        //Page page = PageHelper.startPage(pageNum, pageSize);
        //使用page的getTotal()
       // int total = page.getTotal();
        return pageInfo;
    }

    @Override
    public void updateArticle(String article, Integer sid) {
        articleMapper.updateArticle(article, sid);
    }

    @Override
    public void delArticle(Long sid) {
        articleMapper.deleteByPrimaryKey(sid);
    }
}
