package com.example.demo.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

//@Service
public interface UserService {
    public List<User> getAllUser() ;
    public int addUser(User user) ;
    public int updateUser(User user) ;
}
