package com.mytests.springBoot.autoconfiguration.importedConfigs1;

import com.mytests.springBoot.autoconfiguration.beans.Bean20;
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
//@ConditionalOnBean(name="confcomp111_condition")
@ConditionalOnProperty(name = "myprops.deep1", havingValue = "true")
public class ConfigComponent111 {

    @Bean
    public Bean20 bean20_from_configcomp111() {
        return new Bean20();
    }
}
