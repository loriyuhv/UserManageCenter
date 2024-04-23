package com.wsw.springboot04_mybatis.service.impl;

import com.wsw.springboot04_mybatis.mapper.UserMapper;
import com.wsw.springboot04_mybatis.pojo.User;
import com.wsw.springboot04_mybatis.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author loriyuhv
 * @ClassName UserServiceImpl
 * @date 2024/4/23 23:11
 * @description TODO
 */

@Service
public class UserServiceImpl implements UserService {
    private final UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findById(Integer id) {
        return userMapper.findById(id);
    }
}
