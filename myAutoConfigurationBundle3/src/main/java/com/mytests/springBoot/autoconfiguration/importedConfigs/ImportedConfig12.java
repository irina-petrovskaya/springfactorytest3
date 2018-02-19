package com.mytests.springBoot.autoconfiguration.importedConfigs;

import com.mytests.springBoot.autoconfiguration.beans.Bean12;
import com.mytests.springBoot.autoconfiguration.beans.Bean15;
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
@ConditionalOnProperty(name="myprops.importedconfig12", havingValue = "true")
//@ConditionalOnBean(name="impconf12_condition")
public class ImportedConfig12 {

    @Bean
    public Bean12  bean12_from_importedconfig12() {
        return new Bean12();
    }
    @Configuration
    @ConditionalOnProperty(name="myprops.importedcfg12inner", havingValue = "true")
    //@ConditionalOnBean(name="impconf12inner_condition")
    public static class ImportedCfg12Inner{
        @Bean
        public Bean15 bean15_from_importedcfg12inner() {
            return new Bean15();
        }
    }
}
