package com.fashion.mjysite.service;

import com.fashion.mjysite.entity.Atta;
import com.fashion.mjysite.entity.Form;
import com.fashion.mjysite.entity.FormDetail;
import com.fashion.mjysite.entity.Sign;
import com.github.pagehelper.PageInfo;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

public interface FormService {
    String createSignForm(HttpServletRequest request, Form prform)throws Exception;
    PageInfo<Form> selectFromList(Integer page, Integer limit, String formtype);
    List<Map<String,Object>> getFormSum(String account);
    List<Form> getFormInfor(String formcode);
    List<Sign> getSignHistory(String formcode);
    void agreeSign(String formcode, String signremark);
    void disagreeSign(String formcode, String signremark);
    //String createFormCode(String dept, String formType);
//    void insertForm(Form form);
//    void insertFormDetail(List<FormDetail> formDetailList);
//    void insertAtta(List<Atta> attaList);
}
