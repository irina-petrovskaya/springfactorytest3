package com.mytests.springBoot.autoconfiguration.bundle3_usage;

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
public class ConditionalOnBeanTest {

    @Autowired(required=false) @Qualifier("main1_condition") String main1_condition;
    @Autowired(required = false)
    private MainConfig1 mainConfig1;
    @Autowired(required=false)
    private Bean1 bean1_from_mainconfig1;

    @Autowired(required=false) @Qualifier("confcomp10_condition") String confcomp10_condition;
    @Autowired(required = false)
    private ConfigComponent10 configComponent10;
    @Autowired(required=false)
    private Bean10 bean10_from_configcomponent10;

    @Autowired(required=false) @Qualifier("impconf11_condition")
    private String impconf11_condition;
    @Autowired(required = false)
     private ImportedConfig11 importedConfig11;
    @Autowired(required=false)
     private Bean11 bean11_from_importedconfig11;

    @Autowired(required=false) @Qualifier("impconf12_condition")
    private String impconf12_condition;
    @Autowired(required = false)
     private ImportedConfig12 importedConfig12;
    @Autowired(required=false)
     private Bean12 bean12_from_importedconfig12;

    @Autowired(required=false) @Qualifier("impconf12inner_condition")
    private String impconf12inner_condition;
    @Autowired(required = false)
    private ImportedConfig12.ImportedCfg12Inner importedCfg12Inner;
    @Autowired(required=false)
    private Bean15 bean15_from_importedcfg12inner;

    @Autowired(required=false) @Qualifier("comp10_condition")
    private String comp10_condition;
    @Autowired(required = false)
    private Component10 component10;
    @Autowired( required=false)
    private Bean13 bean13_from_component10;

    @Autowired(required=false) @Qualifier("component11inner_condition")
    private String comp11inner_condition;
    @Autowired(required = false)
    private Component11.Component11Inner component11Inner;
    @Autowired(required=false)
    private Bean14 bean14_from_component11inner;

    @Autowired(required=false) @Qualifier("confcomp11inner_condition")
    private String confcomp11inner_condition;
    @Autowired(required=false) @Qualifier("confcomp11_condition")
    private String confcomp11_condition;
    @Autowired(required = false)
    private ConfigComponent11.ConfComp11Inner confComp11Inner;
    @Autowired(required=false)
    private Bean16 bean16_from_confcomp11inner;

    // no conditions here except mainconfig1 condition
    @Autowired(required = false)
    private ImportedConfig13 importedConfig13;
    @Autowired(required = false)
    private Bean18 bean18_from_importedconfig13;

    @Autowired(required=false) @Qualifier("confcomp111_condition")
    String confcomp111_condition;
    @Autowired(required = false)
    private ConfigComponent111 configComponent111;
    @Autowired(required = false)
    private Bean20 bean20_from_configcomp111;

    // no conditions here except mainconfig1 condition
    @Autowired(required=false)
    private Bean17 bean17_from_xml;



    @Test
    public void testMainConfig1() {
        if(main1_condition != null) {
            System.out.println("condition for mainconfig1 is ok:");
            System.out.println("bean1_from_mainconfig1 and mainconfig1 beans should be available");
            System.out.println("bean17_from_xml, bean18_from_importedconfig13 and importedConfig13 also");
        Assert.assertNotNull("mainconfig1 bean",mainConfig1);
        Assert.assertNotNull("bean1_from_mainconfig1", bean1_from_mainconfig1);
        Assert.assertNotNull("importedConfig13", importedConfig13);
        Assert.assertNotNull("bean18_from_importedconfig13", bean18_from_importedconfig13);
        Assert.assertNotNull("bean17_from_xml", bean17_from_xml);
        ;} else {
            System.out.println("condition for mainconfig1 is broken:");
            System.out.println("bean1_from_mainconfig1 and mainconfig1 beans should be not available");
            System.out.println("bean17_from_xml, bean18_from_importedconfig13 and importedConfig13 also");
            Assert.assertNull("mainconfig1 bean",mainConfig1);
            Assert.assertNull("bean1_from_mainconfig1", bean1_from_mainconfig1);
            Assert.assertNull("importedConfig13", importedConfig13);
            Assert.assertNull("bean18_from_importedconfig13", bean18_from_importedconfig13);
            Assert.assertNull("bean17_from_xml", bean17_from_xml);
            ;
        }
    }

    @Test
    public void testConfComp11() {
        if((confcomp11inner_condition != null)&&(confcomp11_condition != null)) {
            System.out.println("conditions for confcomp11inner and configcomponent11 are ok:");
            System.out.println("bean16_from_confcomp11inner and confComp11Inner beans should be available");

            Assert.assertNotNull(confComp11Inner);
            Assert.assertNotNull(bean16_from_confcomp11inner);}
        else {

            System.out.println("conditions for confcomp11inner and configcomponent11 are broken:");
            System.out.println("bean16_from_confcomp11inner and confComp11Inner beans should not be available");

            Assert.assertNull(confComp11Inner);
            Assert.assertNull(bean16_from_confcomp11inner);
        }
    }

    @Test
    public void testImportedConfigs() {
        if ((impconf11_condition != null)&&(impconf12_condition != null)&&(impconf12inner_condition!= null)) {
            System.out.println("all beans from imported configs should be available");
            Assert.assertNotNull(importedConfig11);
            Assert.assertNotNull(importedConfig12);
            Assert.assertNotNull(importedCfg12Inner);
            Assert.assertNotNull(bean11_from_importedconfig11);
            Assert.assertNotNull(bean12_from_importedconfig12);
            Assert.assertNotNull(bean15_from_importedcfg12inner);
        } else {
            System.out.println("all beans from imported configs should not be available");
            Assert.assertNotNull("importedConfig11",importedConfig11);
            Assert.assertNotNull("importedConfig12",importedConfig12);
            Assert.assertNotNull("importedCfg12Inner",importedCfg12Inner);
            Assert.assertNotNull("bean11_from_importedconfig11",bean11_from_importedconfig11);
            Assert.assertNotNull("bean12_from_importedconfig12",bean12_from_importedconfig12);
            Assert.assertNotNull("bean15_from_importedcfg12inner",bean15_from_importedcfg12inner);
        }
    }
}
