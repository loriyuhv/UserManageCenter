package com.wsw.springboot05_bean_register.anno;

import com.wsw.springboot05_bean_register.config.CommonImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) // 表示我当前的注解可以在类上使用
@Retention(RetentionPolicy.RUNTIME) // 表示当前的注解会保留在运行时阶段
@Import(CommonImportSelector.class)
public @interface EnableCommonConfig {
}
