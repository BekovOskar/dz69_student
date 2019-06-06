package com.bekov.main_student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MainStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(MainStudentApplication.class, args);
    }

}
