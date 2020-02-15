package com.wzl.registycenter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistycenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistycenterApplication.class, args);
    }

}
