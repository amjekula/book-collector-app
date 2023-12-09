package com.payu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "${scan.packages:com.payu}")
@ComponentScan(basePackages = "com.payu")
public class Application {
    public static void main( String[] args ) {
        SpringApplication.run(Application.class, args);
    }
}
