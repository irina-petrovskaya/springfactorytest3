package com.mytests.springBoot.autoconfiguration.scannedComponents;

import com.mytests.springBoot.autoconfiguration.beans.Bean16;
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
@ConditionalOnProperty(name="myprops.configcomp11", havingValue = "true")
//@ConditionalOnBean(name = "confcomp11_condition")
public class ConfigComponent11 {

    @Configuration
    @ConditionalOnProperty(name="myprops.configcomp11inner", havingValue = "true")
    //@ConditionalOnBean(name = "confcomp11inner_condition")
    public static class ConfComp11Inner{
        @Bean
        public Bean16 bean16_from_confcomp11inner() {
            return new Bean16();
        }
    }
}
