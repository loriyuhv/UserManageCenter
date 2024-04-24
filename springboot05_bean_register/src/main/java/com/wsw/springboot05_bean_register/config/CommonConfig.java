package com.wsw.springboot05_bean_register.config;

import cn.itcast.pojo.Country;
import cn.itcast.pojo.Province;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author loriyuhv
 * @ClassName CommonConfig
 * @date 2024/4/24 8:12
 * @description 注册第三方Bean到IOC容器
 */

// @Configuration
public class CommonConfig {
    // 注入Country对象
    // @Bean   // 将方法的返回值交给IOC容器管理，成为IOC容器的对象
    /**
     * @description Parameter 0 of method country in
     * com.wsw.springboot05_bean_register.config.CommonConfig required
     * a bean of type 'java.lang.String' that could not be found.
     */
    // public Country country(@Value("${country.name}") String name, @Value("${country.system}") String system) {
    //     Country country = new Country();
    //     // country.setName("China");
    //     // country.setSystem("socialism");
    //     country.setName(name);
    //     country.setSystem(system);
    //     return country;
    // }

    // @Bean("wsw") // 对象默认的名字是方法名
    // 如果方法的内部需要使用到IOC容器中已经存在的bean对象，
    // 那么只需要在方法上声明即可，spring会自动注入
    // @Bean
    // public Province province(Country country) {
    //     System.out.println("province: " + country);
    //     return new Province();
    // }

    // 如果配置文件中配置了指定的信息，则注入，否则不注入
    @Bean
    @ConditionalOnProperty(prefix = "country", name = {"name", "system"})
    public Country country(@Value("${country.name}") String name, @Value("${country.system}") String system) {
        Country country = new Country();
        country.setName(name);
        country.setSystem(system);
        return country;
    }

    // 如果IOC容器中存在Country，则注入Province，否则不注入
    // @Bean
    // @ConditionalOnBean(Country.class)
    // public Province province() {
    //     return new Province();
    // }

    // 如果IOC容器中不存在Country，则注入Province，否则不注入
    // @Bean
    // @ConditionalOnMissingBean(Country.class)
    // public Province province() {
    //     return new Province();
    // }

    // 如果当前环境中存在DispatcherServlet类，则注入Province，否则不注入
    // 如果当前引入了web起步依赖，则环境中有DispatcherServlet，否则没有
    @Bean
    @ConditionalOnClass(name = "org.springframework.web.servlet.DispatcherServlet")
    public Province province() {
        return new Province();
    }
}
