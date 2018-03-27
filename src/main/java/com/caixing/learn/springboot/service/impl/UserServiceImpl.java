package com.caixing.learn.springboot.service.impl;

import com.caixing.learn.springboot.entity.User;
import com.caixing.learn.springboot.mapper.UserMapper;
import com.caixing.learn.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper mapper;

    @Override
    public int createUser(User user) {
        int num =mapper.insert(user);
        return num;
    }
}
