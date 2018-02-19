package com.mytests.springBoot.autoconfiguration.importedConfigs;

import com.mytests.springBoot.autoconfiguration.beans.Bean18;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@Configuration
public class ImportedConfig13 {
    @Bean
    public Bean18 bean18_from_importedconfig13() {
        return new Bean18();
    }
}
