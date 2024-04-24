package com.wsw.springboot05_bean_register;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import com.wsw.springboot05_bean_register.anno.EnableCommonConfig;
import com.wsw.springboot05_bean_register.config.CommonConfig;
import com.wsw.springboot05_bean_register.config.CommonImportSelector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;

@SpringBootApplication
// @Import({CommonConfig.class}) // 导入配置类
// @Import(CommonImportSelector.class)
@EnableCommonConfig
public class Springboot05BeanRegisterApplication {
    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Springboot05BeanRegisterApplication.class, args);
        // Country country = context.getBean(Country.class);
        // System.out.println(country);

        Province province = (Province) context.getBean("province");
        System.out.println(province);
    }
}
