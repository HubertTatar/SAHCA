package com.mycompany;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.lang.management.ManagementFactory;

@SpringBootApplication
public class CredentialsAppApplication {

    private static final Logger LOGGER = Logger.getLogger(CredentialsAppApplication.class);

    public static void main(String[] args) {
        LOGGER.info(String.format("JVM startup: %d milliseconds", ManagementFactory.getRuntimeMXBean().getUptime()));
        SpringApplication.run(CredentialsAppApplication.class, args);
    }
}
