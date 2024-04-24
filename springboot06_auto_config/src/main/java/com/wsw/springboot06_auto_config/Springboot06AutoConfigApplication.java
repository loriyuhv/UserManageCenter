package com.wsw.springboot06_auto_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Springboot06AutoConfigApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Springboot06AutoConfigApplication.class, args);
        // System.out.println(context.getBean("dispatcherServlet"));
        System.out.println(context.getBean("country"));

    }

}
