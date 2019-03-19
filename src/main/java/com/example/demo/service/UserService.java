package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {

    @Resource
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
        // TODO Auto-generated method stub
        int i = userMapper.updateUser(user);
        return i;
    }
}
