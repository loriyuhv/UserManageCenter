package com.wsw.springboot04_mybatis.service;

import com.wsw.springboot04_mybatis.pojo.User;

/**
 * @author loriyuhv
 * @ClassName UserService
 * @date 2024/4/23 23:11
 * @description TODO
 */

public interface UserService {
    User findById(Integer id);
}
