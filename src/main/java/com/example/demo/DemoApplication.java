package com.example.demo;

import com.example.demo.api.DBReference;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        DBReference db = new DBReference();
        SpringApplication.run(DemoApplication.class, args);
    }

}
