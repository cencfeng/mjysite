package com.fashion.mjysite.mapper;

import com.fashion.mjysite.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DeptMapper {
    List<Dept> getDept();
}
