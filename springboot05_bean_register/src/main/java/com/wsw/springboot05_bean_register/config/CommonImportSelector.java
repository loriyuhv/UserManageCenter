package com.wsw.springboot05_bean_register.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * @author loriyuhv
 * @ClassName CommonImportSelector
 * @date 2024/4/24 8:25
 * @description ImportSelector接口实现类
 */


public class CommonImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        // 注意，这里的文件是硬编码，所以耦合度较高，最好用配置文件来实现
        // return new String[]{"com.wsw.springboot05_bean_register.config.CommonConfig"};
        // 读取配置文件的内容
        List<String> imports = new ArrayList<>();
        InputStream inputStream = CommonImportSelector.class.getClassLoader().getResourceAsStream("common.imports");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                imports.add(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return imports.toArray(new String[0]);
    }
}
