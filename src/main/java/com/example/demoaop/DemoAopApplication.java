package com.example.demoaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAopApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(DemoAopApplication.class, args);
        Message message = context.getBean(Message.class);

        message.generateMessage("Martin");
        message.generateMessage("Ivan");
        message.generateMessage("Tom");

        message.operations(10);
        message.operations(0);

        System.out.println(message.operationsWithResult(10));
    }

}
