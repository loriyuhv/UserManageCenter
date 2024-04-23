package com.wsw.springboot04_mybatis.controller;

import com.wsw.springboot04_mybatis.pojo.User;
import com.wsw.springboot04_mybatis.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author loriyuhv
 * @ClassName UserController
 * @date 2024/4/23 23:13
 * @description TODO
 */

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("findById")
    public User findById(Integer id) {
        return userService.findById(id);
    }
}
