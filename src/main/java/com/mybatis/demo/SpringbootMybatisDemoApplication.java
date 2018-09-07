package com.mybatis.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = {"com.mybatis.demo.mapper"})
@EnableTransactionManagement
public class SpringbootMybatisDemoApplication {

    //Mybatis默认配置的事务管理器>>>>>>org.springframework.jdbc.datasource.DataSourceTransactionManager
    @Bean
    public Object platformTransactionManager(PlatformTransactionManager manager){
        System.out.println("Mybatis默认配置的事务管理器>>>>>>"+manager.getClass().getName());
        return new Object();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisDemoApplication.class, args);
    }
}
