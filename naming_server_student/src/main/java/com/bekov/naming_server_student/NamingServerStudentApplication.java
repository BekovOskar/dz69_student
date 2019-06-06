package com.bekov.naming_server_student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class NamingServerStudentApplication {

    public static void main(String[] args) {
        SpringApplication.run(NamingServerStudentApplication.class, args);
    }

}
