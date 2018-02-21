package com.mytests.springBoot.autoconfiguration;

import com.mytests.springBoot.autoconfiguration.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.importedConfigs.ImportedConfig11;
import com.mytests.springBoot.autoconfiguration.importedConfigs.ImportedConfig12;
import com.mytests.springBoot.autoconfiguration.importedConfigs.ImportedConfig13;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@Configuration
@Import({ImportedConfig11.class, ImportedConfig12.class, ImportedConfig13.class})
@ImportResource("xml-config.xml")
//@ConditionalOnProperty(name = "myprops.main1", havingValue = "true", matchIfMissing = false)
@ConditionalOnBean(name = "main1_condition")
public class MainConfig1 {

    @Bean
    public Bean1 bean1_from_mainconfig1() {
        return new Bean1();
    }


}
