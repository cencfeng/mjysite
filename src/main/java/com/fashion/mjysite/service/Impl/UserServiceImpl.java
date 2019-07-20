package com.fashion.mjysite.service.Impl;

import com.fashion.mjysite.entity.User;
import com.fashion.mjysite.mapper.UserMapper;
import com.fashion.mjysite.service.UserService;
import com.fashion.mjysite.util.Md5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public User selectUserByUserName(String username) {
        User user = userMapper.selectUserByUserName(username);
        return user;
    }

    @Override
    public User selectUserMapByUserName(String username) {
        return userMapper.selectUserMapByUserName(username);
    }

    @Override
    public void updateFaceImg(String userName, String faceImg) {
        userMapper.updateFaceImg(userName, faceImg);
    }

    @Override
    public void changePwd(String username, String password) {
        String pwd = Md5Util.encrypt(password);
        userMapper.changePwd(username, pwd);
    }
}
