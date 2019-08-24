package com.fashion.mjysite.service.Impl;

import com.fashion.mjysite.entity.Dept;
import com.fashion.mjysite.mapper.DeptMapper;
import com.fashion.mjysite.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> getDept() {
        return deptMapper.getDept();
    }
}
