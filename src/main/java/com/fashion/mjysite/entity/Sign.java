package com.fashion.mjysite.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Sign implements Serializable{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.formcode
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String formcode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.formtype
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String formtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.account
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.username
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.actionname
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String actionname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.signorder
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private Integer signorder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.signtime
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date signtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.actionflag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String actionflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.signremark
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String signremark;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign.flag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.id
     *
     * @return the value of sys_sign.id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.id
     *
     * @param id the value for sys_sign.id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.formcode
     *
     * @return the value of sys_sign.formcode
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getFormcode() {
        return formcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.formcode
     *
     * @param formcode the value for sys_sign.formcode
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setFormcode(String formcode) {
        this.formcode = formcode == null ? null : formcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.formtype
     *
     * @return the value of sys_sign.formtype
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getFormtype() {
        return formtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.formtype
     *
     * @param formtype the value for sys_sign.formtype
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setFormtype(String formtype) {
        this.formtype = formtype == null ? null : formtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.account
     *
     * @return the value of sys_sign.account
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.account
     *
     * @param account the value for sys_sign.account
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.username
     *
     * @return the value of sys_sign.username
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.username
     *
     * @param username the value for sys_sign.username
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.actionname
     *
     * @return the value of sys_sign.actionname
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getActionname() {
        return actionname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.actionname
     *
     * @param actionname the value for sys_sign.actionname
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setActionname(String actionname) {
        this.actionname = actionname == null ? null : actionname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.signorder
     *
     * @return the value of sys_sign.signorder
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public Integer getSignorder() {
        return signorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.signorder
     *
     * @param signorder the value for sys_sign.signorder
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setSignorder(Integer signorder) {
        this.signorder = signorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.signtime
     *
     * @return the value of sys_sign.signtime
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public Date getSigntime() {
        return signtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.signtime
     *
     * @param signtime the value for sys_sign.signtime
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setSigntime(Date signtime) {
        this.signtime = signtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.actionflag
     *
     * @return the value of sys_sign.actionflag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getActionflag() {
        return actionflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.actionflag
     *
     * @param actionflag the value for sys_sign.actionflag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setActionflag(String actionflag) {
        this.actionflag = actionflag == null ? null : actionflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.signremark
     *
     * @return the value of sys_sign.signremark
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getSignremark() {
        return signremark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.signremark
     *
     * @param signremark the value for sys_sign.signremark
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setSignremark(String signremark) {
        this.signremark = signremark == null ? null : signremark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign.flag
     *
     * @return the value of sys_sign.flag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign.flag
     *
     * @param flag the value for sys_sign.flag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}