package com.example.demoshardingsphere;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.transaction.jta.JtaAutoConfiguration;

@SpringBootApplication(exclude = JtaAutoConfiguration.class)
public class DemoShardingsphereApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoShardingsphereApplication.class, args);
    }

}
