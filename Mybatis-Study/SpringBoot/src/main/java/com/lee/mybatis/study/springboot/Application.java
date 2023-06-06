package com.lee.mybatis.study.springboot;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author liylw
 * @date 2023/6/6 09:32
 */
@SpringBootApplication(exclude= DataSourceAutoConfiguration.class)
public class Application {


    public static void main(String[] args) {
        final SpringApplication springApplication = new SpringApplicationBuilder(Application.class).build();
        springApplication.setAllowBeanDefinitionOverriding(true);
        springApplication.run(args);

    }
}
