package com.fashion.mjysite.mapper;

import com.fashion.mjysite.entity.FormDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface FormDetailMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_form_detail
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_form_detail
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    int insert(FormDetail record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_form_detail
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    FormDetail selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_form_detail
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    List<FormDetail> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cost_form_detail
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    int updateByPrimaryKey(FormDetail record);
}