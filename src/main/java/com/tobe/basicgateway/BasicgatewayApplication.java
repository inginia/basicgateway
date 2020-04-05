package com.tobe.basicgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BasicgatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BasicgatewayApplication.class, args);
    }
}
