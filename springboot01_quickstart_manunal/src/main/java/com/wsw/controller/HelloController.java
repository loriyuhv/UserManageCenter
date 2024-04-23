package com.wsw.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author loriyuhv
 * @ClassName HelloController
 * @date 2024/4/23 23:00
 * @description TODO
 */

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello world!!!");
        return "hello world!!!";
    }
}
