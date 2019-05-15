package com.fashion.mjysite.entity;

import java.io.Serializable;
import java.util.List;

public class User implements Serializable{
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.username
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.password
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.nickname
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.dept_id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private Integer deptId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.position_id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private Integer positionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.email
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.idcard
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String idcard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.sex
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.image
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.phone
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String phone;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.active
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String active;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sys_user.salt
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    private String salt;
    private List<Role> roleList;
    private List<Menu> menuList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.id
     *
     * @return the value of sys_user.id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.id
     *
     * @param id the value for sys_user.id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.username
     *
     * @return the value of sys_user.username
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.username
     *
     * @param username the value for sys_user.username
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.password
     *
     * @return the value of sys_user.password
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.password
     *
     * @param password the value for sys_user.password
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.nickname
     *
     * @return the value of sys_user.nickname
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.nickname
     *
     * @param nickname the value for sys_user.nickname
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.dept_id
     *
     * @return the value of sys_user.dept_id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public Integer getDeptId() {
        return deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.dept_id
     *
     * @param deptId the value for sys_user.dept_id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setDeptId(Integer deptId) {
        this.deptId = deptId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.position_id
     *
     * @return the value of sys_user.position_id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public Integer getPositionId() {
        return positionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.position_id
     *
     * @param positionId the value for sys_user.position_id
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setPositionId(Integer positionId) {
        this.positionId = positionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.email
     *
     * @return the value of sys_user.email
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.email
     *
     * @param email the value for sys_user.email
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.idcard
     *
     * @return the value of sys_user.idcard
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.idcard
     *
     * @param idcard the value for sys_user.idcard
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.sex
     *
     * @return the value of sys_user.sex
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.sex
     *
     * @param sex the value for sys_user.sex
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.image
     *
     * @return the value of sys_user.image
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.image
     *
     * @param image the value for sys_user.image
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.phone
     *
     * @return the value of sys_user.phone
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.phone
     *
     * @param phone the value for sys_user.phone
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.active
     *
     * @return the value of sys_user.active
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getActive() {
        return active;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.active
     *
     * @param active the value for sys_user.active
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setActive(String active) {
        this.active = active == null ? null : active.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sys_user.salt
     *
     * @return the value of sys_user.salt
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sys_user.salt
     *
     * @param salt the value for sys_user.salt
     *
     * @mbg.generated Wed Aug 29 11:55:59 CST 2018
     */
    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }
}