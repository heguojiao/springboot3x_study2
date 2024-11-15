package com.hgj.server;

import com.hgj.springboot_web_rest.controller.UserController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = {"com.hgj"})
public class ServerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(ServerApplication.class, args);
        System.out.println(configurableApplicationContext.getBean(UserController.class));
    }

}
