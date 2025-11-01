package com.sodforge.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.modulith.Modulithic;

@Modulithic(sharedModules = {"common"})
@SpringBootApplication
public class SodForgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SodForgeApplication.class, args);
    }

}
