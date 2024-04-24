package com.wsw.config;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigurationPackage;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author loriyuhv
 * @ClassName MyBatisAutoConfig
 * @date 2024/4/24 12:07
 * @description Mybatis自动配置类
 */

@AutoConfiguration  // 标识当前类是一个自动配置类
public class MyBatisAutoConfig {

    // SqlSessionFactoryBean
    @Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        return sqlSessionFactoryBean;
    }

    @Bean
    // MapperScannerConfigure
    public MapperScannerConfigurer mapperScannerConfigurer(BeanFactory beanFactory) {
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        // 扫描的包：启动的类及其注解
        // 获取Springboot扫描包
        List<String> packages = AutoConfigurationPackages.get(beanFactory);
        String p = packages.get(0);
        mapperScannerConfigurer.setBasePackage(p);
        // 扫描的注解
        mapperScannerConfigurer.setAnnotationClass(Mapper.class);
        return mapperScannerConfigurer;
    }
}
