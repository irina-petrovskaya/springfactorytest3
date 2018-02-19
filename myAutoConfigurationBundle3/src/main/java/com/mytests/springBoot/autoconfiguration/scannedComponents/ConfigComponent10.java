package com.mytests.springBoot.autoconfiguration.scannedComponents;

import com.mytests.springBoot.autoconfiguration.beans.Bean10;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@Configuration
//@ConditionalOnProperty(name="myprops.configcomponent10", havingValue = "true")
@ConditionalOnBean(name = "confcomp10_condition")
public class ConfigComponent10 {

    @Bean
    public Bean10 bean10_from_configcomponent10() {
        return new Bean10();
    }
}
