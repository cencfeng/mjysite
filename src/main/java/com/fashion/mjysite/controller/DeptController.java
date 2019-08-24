package com.fashion.mjysite.controller;

import com.fashion.mjysite.entity.Dept;
import com.fashion.mjysite.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("/dept")
public class DeptController {
    @Autowired
    private DeptService deptService;
    @RequestMapping("/getDept")
    @ResponseBody
    public List<Dept> getDept(){
        List<Dept> deptList = deptService.getDept();
        return deptList;
    }
}
