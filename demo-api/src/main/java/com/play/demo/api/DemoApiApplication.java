package com.play.demo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@EnableDiscoveryClient
@SpringBootApplication
public class DemoApiApplication {

    public static void main(String[] args) {
        try{
            SpringApplication.run(DemoApiApplication.class, args);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
