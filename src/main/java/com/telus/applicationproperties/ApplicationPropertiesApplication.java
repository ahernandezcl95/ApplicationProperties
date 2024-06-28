package com.telus.applicationproperties;

import com.telus.applicationproperties.helper.AccountHelper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApplicationPropertiesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationPropertiesApplication.class, args);
    }

    @Bean
    public CommandLineRunner commandLineRunner() {
        return args -> {
            AccountHelper accountHelper = new AccountHelper();
            accountHelper.getAccountDescription();
        };
    }

}
