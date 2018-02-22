package com.mytests.springBoot.autoconfiguration.bundle3_usage;

import com.mytests.springBoot.autoconfiguration.ContainerConfig;
import com.mytests.springBoot.autoconfiguration.MainConfig1;
import com.mytests.springBoot.autoconfiguration.beans.*;
import com.mytests.springBoot.autoconfiguration.importedConfigs.ImportedConfig11;
import com.mytests.springBoot.autoconfiguration.importedConfigs.ImportedConfig12;
import com.mytests.springBoot.autoconfiguration.importedConfigs.ImportedConfig13;
import com.mytests.springBoot.autoconfiguration.importedConfigs1.ConfigComponent111;
import com.mytests.springBoot.autoconfiguration.scannedComponents.Component10;
import com.mytests.springBoot.autoconfiguration.scannedComponents.Component11;
import com.mytests.springBoot.autoconfiguration.scannedComponents.ConfigComponent10;
import com.mytests.springBoot.autoconfiguration.scannedComponents.ConfigComponent11;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class InnerConfigsTest {


    @Autowired()
    private ContainerConfig.InnerConfig1 innerConfig1;
    @Autowired
    private Bean01 bean01_from_innerconfig1;

    @Autowired
    private Bean02
            bean02_from_innerconfig2;

    @Test
    public void testInnerConfigs() {
        Assert.assertNotNull(bean01_from_innerconfig1);
        Assert.assertNotNull(bean02_from_innerconfig2);
    }
}
