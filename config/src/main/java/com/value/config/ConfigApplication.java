package com.value.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) {
        Logger logger = LoggerFactory.getLogger(ConfigApplication.class);
        SpringApplication.run(ConfigApplication.class, args);
        logger.info("Deployment done");
    }

}
