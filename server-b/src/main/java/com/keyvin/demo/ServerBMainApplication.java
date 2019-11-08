package com.keyvin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 实例B
 * @author weiwh
 * @date 2019/11/8 11:10
 */
@SpringBootApplication
@EnableEurekaClient
public class ServerBMainApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServerBMainApplication.class);
    }
}
