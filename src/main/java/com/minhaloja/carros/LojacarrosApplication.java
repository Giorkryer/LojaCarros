package com.minhaloja.carros;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.minhaloja.carros")
@EnableJpaRepositories(basePackages = "com.minhaloja.carros.repository")
public class LojacarrosApplication {

    public static void main(String[] args) {
        SpringApplication.run(LojacarrosApplication.class, args);
    }
}
