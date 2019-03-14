package com.project.xiaoxin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * @program: project_one
 * @description: XiaoxinApplication
 * @author: jiuson
 * @create: 2019-03-14 11:35
 */
@MapperScan("com.project.xiaoxin.mybatisMapper")
@ServletComponentScan
@SpringBootApplication
public class XiaoxinApplication {

    public static void main(String[] args) {
        SpringApplication.run(XiaoxinApplication.class, args);
    }

}
