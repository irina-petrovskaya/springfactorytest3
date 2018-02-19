package com.mytests.springBoot.autoconfiguration.scannedComponents;

import com.mytests.springBoot.autoconfiguration.beans.Bean13;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@Component("Component10")
//@ConditionalOnBean(name="comp10_condition")
@ConditionalOnProperty(name="myprops.component10", havingValue = "true")
public class Component10 {

    @Value("Component10")
    String id;

    public String getId() {
        return id;
    }

    @Bean
    public Bean13 bean13_from_component10() {
        return new Bean13();
    }
}
