package com.fashion.mjysite.entity;

import java.io.Serializable;

public class SignOrder implements Serializable{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign_order.id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign_order.formtype
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String formtype;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign_order.signorder
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private Integer signorder;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign_order.actionname
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String actionname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign_order.dept
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String dept;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign_order.account
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String account;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign_order.username
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign_order.requireflag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String requireflag;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_sign_order.flag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String flag;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign_order.id
     *
     * @return the value of sys_sign_order.id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign_order.id
     *
     * @param id the value for sys_sign_order.id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign_order.formtype
     *
     * @return the value of sys_sign_order.formtype
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getFormtype() {
        return formtype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign_order.formtype
     *
     * @param formtype the value for sys_sign_order.formtype
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setFormtype(String formtype) {
        this.formtype = formtype == null ? null : formtype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign_order.signorder
     *
     * @return the value of sys_sign_order.signorder
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public Integer getSignorder() {
        return signorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign_order.signorder
     *
     * @param signorder the value for sys_sign_order.signorder
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setSignorder(Integer signorder) {
        this.signorder = signorder;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign_order.actionname
     *
     * @return the value of sys_sign_order.actionname
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getActionname() {
        return actionname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign_order.actionname
     *
     * @param actionname the value for sys_sign_order.actionname
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setActionname(String actionname) {
        this.actionname = actionname == null ? null : actionname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign_order.dept
     *
     * @return the value of sys_sign_order.dept
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getDept() {
        return dept;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign_order.dept
     *
     * @param dept the value for sys_sign_order.dept
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setDept(String dept) {
        this.dept = dept == null ? null : dept.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign_order.account
     *
     * @return the value of sys_sign_order.account
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getAccount() {
        return account;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign_order.account
     *
     * @param account the value for sys_sign_order.account
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign_order.username
     *
     * @return the value of sys_sign_order.username
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign_order.username
     *
     * @param username the value for sys_sign_order.username
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign_order.requireflag
     *
     * @return the value of sys_sign_order.requireflag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getRequireflag() {
        return requireflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign_order.requireflag
     *
     * @param requireflag the value for sys_sign_order.requireflag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setRequireflag(String requireflag) {
        this.requireflag = requireflag == null ? null : requireflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_sign_order.flag
     *
     * @return the value of sys_sign_order.flag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getFlag() {
        return flag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_sign_order.flag
     *
     * @param flag the value for sys_sign_order.flag
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }
}