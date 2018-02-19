package com.mytests.springBoot.autoconfiguration.importedConfigs;

import com.mytests.springBoot.autoconfiguration.beans.Bean11;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@Configuration
@ConditionalOnProperty(name="myprops.importedconfig11", havingValue = "true")
//@ConditionalOnBean(name = "impconf11_condition")
@Import(ImportedConfig111.class)
public class ImportedConfig11 {

    @Bean
    public Bean11 bean11_from_importedconfig11() {
        return new Bean11();
    }
}
