package com.boot.jdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Dmytro Honchar
 * Date: 7/18/2022
 */
@SpringBootApplication(scanBasePackages = "com.boot.jdbc")
public class JdbcApplication {
    public static void main(String[] args) {
        SpringApplication.run(JdbcApplication.class, args);
    }
}
