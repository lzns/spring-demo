package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;
    
    public List<User> getAllUser() {
        return userMapper.getUserList();
    }
    @Transactional(rollbackFor= {Exception.class})
    public int addUser(User user) {
        int count = userMapper.addUser(user);
        return count;
    }
    @Transactional(rollbackFor= {Exception.class})
    public int updateUser(User user) {
        int i = userMapper.updateUser(user);
        return i;
    }
}
