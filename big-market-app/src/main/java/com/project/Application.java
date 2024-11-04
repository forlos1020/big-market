package com.project;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @author KSCS
 */
@SpringBootApplication
@Slf4j
@EnableScheduling
@EnableAsync
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class);
    }

}
