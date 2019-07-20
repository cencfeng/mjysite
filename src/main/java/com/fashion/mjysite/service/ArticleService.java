package com.fashion.mjysite.service;

import com.fashion.mjysite.entity.Article;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ArticleService {
    PageInfo<Article> getArticle(Integer page, Integer limit);
    void updateArticle(String article, Integer sid);
    void delArticle(Long sid);
}
