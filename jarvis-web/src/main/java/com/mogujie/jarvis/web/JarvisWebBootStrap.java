package com.mogujie.jarvis.web;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Web启动入口
 * @author linflytang
 */
@SpringBootApplication
@MapperScan(basePackages = "com.mogujie.jarvis.web.mapper")
public class JarvisWebBootStrap {
    public static void main(String[] args) {
        SpringApplication.run(JarvisWebBootStrap.class,args);
    }
}
