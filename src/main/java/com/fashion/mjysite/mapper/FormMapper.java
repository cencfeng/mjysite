package com.fashion.mjysite.mapper;

import com.fashion.mjysite.entity.*;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

@Mapper
public interface FormMapper {
    void insertSign(List<Sign> signList);
    List<SignOrder> seletSignOrder(@Param("dept") String dept, @Param("formType")String formType, @Param("totalprice")BigDecimal totalprice);
    FormNo createFormCode(@Param("dept") String dept, @Param("formType")String formType);
    void updateFormNo(@Param("dept") String dept, @Param("formType")String formType);
    void insertForm(Form form);
    void insertFormDetail(List<FormDetail> formDetailList);
    void insertAtta(List<Atta> attaList);
    List<Form> selectFromList(@Param("formtype") String formtype, @Param("account") String account);
    List<Map<String,Object>> getFormSum(String account);
    List<Form> getFormInfor(String formcode);
    List<Sign> getSignHistory(String formcode);
    void agreeSign(@Param("formcode") String formcode, @Param("signremark") String signremark);
    void disagreeSign(@Param("formcode") String formcode, @Param("signremark") String signremark);
}
