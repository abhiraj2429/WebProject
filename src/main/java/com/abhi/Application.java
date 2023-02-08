package com.abhi;


import java.io.IOException;

import com.abhi.controller.ConsumerControllerClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

@SpringBootApplication
public class Application {

    public static void main(String[] args) throws RestClientException, IOException {
        ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
        ConsumerControllerClient consumerControllerClient = applicationContext.getBean(ConsumerControllerClient.class);
System.out.println(consumerControllerClient);
consumerControllerClient.getEmployee();


    }

    @Bean
    public ConsumerControllerClient consumerControllerClient(){
        return new ConsumerControllerClient();
    }



/*        @Bean
        public CommandLineRunner commandLineRunner (ApplicationContext ctx){
            return args -> {

                System.out.println("Let's inspect the beans provided by Spring Boot:");

                String[] beanNames = ctx.getBeanDefinitionNames();
                Arrays.sort(beanNames);
                for (String beanName : beanNames) {
                    System.out.println(beanName);
                }

            };
        }*/
    }

