package com.qf.springboot_student;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class SpringbootStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudentApplication.class, args);
    }

}
