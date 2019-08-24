package com.fashion.mjysite.service.Impl;

import com.fashion.mjysite.entity.*;
import com.fashion.mjysite.mapper.FormMapper;
import com.fashion.mjysite.service.FormService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletRequest;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class FormServiceImpl implements FormService {
    @Autowired
    private FormMapper formMapper;
    private User user;

    @Override
    @Transactional//有try catch模块时失效
    public String createSignForm(HttpServletRequest request, Form prform)throws Exception {
        String[] description = request.getParameterValues("description");
        String[] quantity = request.getParameterValues("quantity");
        String[] unitprice = request.getParameterValues("unitprice");
        String[] total = request.getParameterValues("total");
        String[] attaUrl = request.getParameterValues("attaUrl");
        String[] attaName = request.getParameterValues("attaname");
        String formCode = null;
        //HttpSession session = request.getSession();
        FormNo formNo = formMapper.createFormCode(prform.getDept(), prform.getFormtype());
        if(formNo == null){
            return "未设定部门编号";
        }

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        String strCondeNo = String.format("%03d", formNo.getFormno());
        //生成单号
        formCode = (formNo.getSerial() + "-" + formNo.getFormtype() + "-" + formNo.getDept() + sdf.format(date).substring(2) + "-" + strCondeNo).toUpperCase();
        //User user = (User)session.getAttribute("user");
        user = (User) SecurityUtils.getSubject().getPrincipal();
        prform.setFormcode(formCode);
        prform.setAccount(user.getUsername());
        prform.setOriginator(user.getNickname());
        List<FormDetail> formDetailList = new ArrayList<FormDetail>();
        for(int i=0;i<description.length;i++){
            if(description[i]!=null){
                FormDetail formDetail = new FormDetail();
                formDetail.setFormcode(formCode);
                formDetail.setPartno(i+1);
                formDetail.setDescription(description[i]);
                formDetail.setQuantity(Integer.parseInt(quantity[i]));
                formDetail.setUnitprice(new BigDecimal(unitprice[i]));
                formDetail.setTotal(new BigDecimal(total[i]));
                formDetailList.add(formDetail);
            }
            //formService.insertPrDetail(formDetailList);
        }
        List<Atta> attaList = new ArrayList<Atta>();
        if(attaUrl != null){
            for (int i=0;i<attaUrl.length;i++){
                if(attaUrl[i] != null){
                    Atta atta = new Atta();
                    atta.setFormcode(formCode);
                    atta.setAttaname(attaName[i]);
                    atta.setAttaurl(attaUrl[i]);
                    atta.setAttano(i+1);
                    attaList.add(atta);
                }
            }
        }
        List<SignOrder> signorderList = formMapper.seletSignOrder(prform.getDept(), prform.getFormtype(),prform.getTotalprice());
        List<Sign> signList = new ArrayList<Sign>();
        if(!signorderList.isEmpty()){
            int minSignOrder = signorderList.stream().mapToInt(SignOrder::getSignorder).min().getAsInt();//选出最小
            for(SignOrder signorder : signorderList){
                Sign sign = new Sign();
                sign.setFormtype(signorder.getFormtype());
                sign.setFormcode(formCode);
                sign.setActionname(signorder.getActionname());
                sign.setAccount(signorder.getAccount());
                sign.setUsername(signorder.getUsername());
                sign.setSignorder(signorder.getSignorder());
                if(signorder.getSignorder() == minSignOrder){
                    sign.setActionflag("1");
                }else{
                    sign.setActionflag("0");
                }
                signList.add(sign);
            }
        }else {
            return "未设定签核路由";
        }

            //0未签 2已签 1在签,3加签
//               if(signorder.getSignorder() == 1){
//                   sign.setSigntime(date);
//                   sign.setActionflag("2");
//                   sign.setAccount(user.getUsername());
//                   sign.setUsername(user.getNickname());
//                   sign.setSignremark(prform.getDelivery());
//               }
//               else if(signorder.getSignorder() == 2){
//                   sign.setActionflag("1");
//               }else{
        Sign sign = new Sign();
        sign.setFormcode(formCode);
        sign.setFormtype(prform.getFormtype());
        sign.setAccount(user.getUsername());
        sign.setUsername(user.getNickname());
        sign.setSignorder(0);
        sign.setActionname("发起人");
        sign.setActionflag("2");//2已签,1在签, 0未签
        signList.add(sign);
        //更新formno
        formMapper.updateFormNo(prform.getDept(), prform.getFormtype());
        //formMapper.updateFormNo();
        //写入总表
        formMapper.insertForm(prform);
        //写入明细表
        formMapper.insertFormDetail(formDetailList);
        //附件表
        if(!attaList.isEmpty()){
            formMapper.insertAtta(attaList);
        }
            //签核表
        formMapper.insertSign(signList);

        return formCode;
    }

    @Override
    public PageInfo<Form> selectFromList(Integer page, Integer limit, String formtype) {
        PageHelper.startPage(page,limit);
        user = (User) SecurityUtils.getSubject().getPrincipal();
        List<Form> formList = formMapper.selectFromList(formtype, user.getUsername());
        PageInfo<Form> pageInfo = new PageInfo<Form>(formList);
        return pageInfo;
    }

    @Override
    public List<Map<String, Object>> getFormSum(String account) {
        return formMapper.getFormSum(account);
    }

    @Override
    public List<Form> getFormInfor(String formcode) {
        return formMapper.getFormInfor(formcode);
    }

    @Override
    public List<Sign> getSignHistory(String formcode) {
        return formMapper.getSignHistory(formcode);
    }

    @Override
    @Transactional
    public void agreeSign(String formcode, String signremark) {
        formMapper.agreeSign(formcode, signremark);
    }
    @Override
    @Transactional
    public void disagreeSign(String formcode, String signremark) {
        formMapper.disagreeSign(formcode, signremark);
    }
}
