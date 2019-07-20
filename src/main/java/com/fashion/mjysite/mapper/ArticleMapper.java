package com.fashion.mjysite.mapper;

import com.fashion.mjysite.entity.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
@Mapper
public interface ArticleMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    int insert(Article record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    Article selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    List<Article> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_article
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    int updateByPrimaryKey(Article record);

    int updateArticle(@Param("article") String article, @Param("sid")Integer sid);
}