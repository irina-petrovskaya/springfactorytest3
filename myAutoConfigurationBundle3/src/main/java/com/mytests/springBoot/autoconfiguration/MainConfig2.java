package com.mytests.springBoot.autoconfiguration;

import com.mytests.springBoot.autoconfiguration.beans.Bean1;
import com.mytests.springBoot.autoconfiguration.importedConfigs.ImportedConfig11;
import com.mytests.springBoot.autoconfiguration.importedConfigs.ImportedConfig12;
import com.mytests.springBoot.autoconfiguration.importedConfigs.ImportedConfig13;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.context.annotation.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@Configuration
//@ConditionalOnBean(name="main2_condition")
@ComponentScan("com.mytests.springBoot.autoconfiguration.scannedComponents")
public class MainConfig2 {




}
