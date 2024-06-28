package com.telus.applicationproperties.helper;

import com.telus.applicationproperties.config.ApplicationProperties;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;


@Component
public class AccountHelper {

    private final Logger log = Logger.getLogger(AccountHelper.class.getName());

    public void getAccountDescription() {
        log.info("In the beggining of getAccountDescription");
        boolean isSwaggerEnabled = ApplicationProperties.isSwaggerEnabled();
        log.info("isSwaggerEnabled: " + isSwaggerEnabled);
    }

}
