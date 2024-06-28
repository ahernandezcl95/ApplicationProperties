package com.telus.applicationproperties.config;

import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

    private final AppConfig appConfig;

    private static ApplicationProperties instance;

    private ApplicationProperties(AppConfig appConfig) {
        this.appConfig = appConfig;
        instance = this;
    }

    public static boolean isSwaggerEnabled() {
        return instance.appConfig.getSwagger().isEnabled();
    }

}
