package com.kestrelcjx.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@MapperScan("com.kestrelcjx.**.mapper")
@SpringBootApplication(scanBasePackages = {"com.kestrelcjx.*"})
@EnableTransactionManagement
public class AdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(AdminApplication.class, args);
        System.out.println("JavaWeb启动成功");
    }
}
