package com.fashion.mjysite.entity;

import java.io.Serializable;

public class Dept implements Serializable {
    private int id;
    private String dept;
    private String dept_remark;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDept_remark() {
        return dept_remark;
    }

    public void setDept_remark(String dept_remark) {
        this.dept_remark = dept_remark;
    }
}