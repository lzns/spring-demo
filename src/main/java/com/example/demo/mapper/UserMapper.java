package com.example.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {
    public List<User> getUserList();
    public int addUser(User user);
    public int updateUser(User user);
}
