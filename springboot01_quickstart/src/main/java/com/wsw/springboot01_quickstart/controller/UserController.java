package com.wsw.springboot01_quickstart.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author loriyuhv
 * @ClassName UserController
 * @date 2024/4/23 22:32
 * @description TODO
 */

@RestController
public class UserController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello world!");
        return "Hello world!";
    }
}
