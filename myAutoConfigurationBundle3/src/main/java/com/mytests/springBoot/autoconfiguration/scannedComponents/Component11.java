package com.mytests.springBoot.autoconfiguration.scannedComponents;

import com.mytests.springBoot.autoconfiguration.beans.Bean14;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@Component("Component11")
//@ConditionalOnBean(name="component11_condition")
@ConditionalOnProperty(name="myprops.component11", havingValue = "true")
public class Component11 {

    @Value("Component11")
    String id;

    public String getId() {
        return id;
    }

    @Configuration
    @ConditionalOnBean(name="component11inner_condition")
    //@ConditionalOnProperty(name="myprops.component11inner", havingValue = "true")
    public static class Component11Inner{

        @Bean
        public Bean14 bean14_from_component11inner() {
            return new Bean14();
        }
    }
}
