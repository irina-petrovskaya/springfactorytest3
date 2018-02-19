package com.mytests.springBoot.autoconfiguration;

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

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UseMyautoconfigurationbundle3ApplicationTest {

    @Autowired @Qualifier("main_condition") String main_condition;
    @Autowired(required = false)
    private MainConfig1 mainConfig1;
    @Autowired(required=false)
    private Bean1 bean1_from_mainconfig1;

    @Autowired @Qualifier("confcomp10_condition") String confcomp10_condition;
    @Autowired(required = false)
    private ConfigComponent10 configComponent10;
    @Autowired(required=false)
    private Bean10 bean10_from_configcomponent10;

    @Autowired @Qualifier("impconf11_condition")
    private String impconf11_condition;
    @Autowired(required = false)
    private ImportedConfig11 importedConfig11;
    @Autowired(required=false)
    private Bean11 bean11_from_importedconfig11;

    @Autowired @Qualifier("impconf12_condition")
    private String impconf12_condition;
    @Autowired(required = false)
    private ImportedConfig12 importedConfig12;
    @Autowired(required=false)
    private Bean12 bean12_from_importedconfig12;

    @Autowired @Qualifier("impconf12inner_condition")
    private String impconf12inner_condition;
    @Autowired(required = false)
    private ImportedConfig12.ImportedCfg12Inner importedCfg12Inner;
    @Autowired(required=false)
    private Bean15 bean15_from_importedcfg12inner;

    @Autowired(required = false)
    private Component10 component10;
    @Autowired( required=false)
    private Bean13 bean13_from_component10;

    @Autowired(required = false)
    private Component11.Component11Inner inner;
    @Autowired(required=false)
    private Bean14 bean14_from_component11inner;


    @Autowired(required = false)
    private ConfigComponent11.ConfComp11Inner confComp11Inner;
    @Autowired(required=false)
    private Bean16 bean16_from_confcomp11inner;

    @Autowired(required = false)
    private ImportedConfig13 importedConfig13;
    @Autowired(required = false)
    private Bean18 bean18_from_importedconfig13;

    @Autowired(required = false)
    private ConfigComponent111 configComponent111;
    @Autowired(required = false)
    private Bean20 bean20_from_configcomp111;

    @Autowired(required=false)
    private Bean17 bean17_from_xml;



    @Test
    public void testMainConfig1() {
        Assert.assertNotNull(mainConfig1);
        Assert.assertNotNull(bean1_from_mainconfig1);
    }

    @Test
    public void testConfComp11() {
        Assert.assertNotNull(confComp11Inner);
        Assert.assertNotNull(bean16_from_confcomp11inner);
    }
}
