package com.springboot.demofirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.springboot.demofirst.mapper")
public class DemofirstApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemofirstApplication.class, args);
    }

}

