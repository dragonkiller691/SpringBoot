package com.springboot.simple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dmytro Honchar
 * Date: 7/13/2022
 */

@RestController
@SpringBootApplication
public class SimpleWebApp {
    public static void main(String[] args) {
        SpringApplication.run(SimpleWebApp.class, args);
    }

    @RequestMapping("/")
    public String greetings() {
        return "<h1>Spring Boot Rocks in Java too!</h1>";
    }
}