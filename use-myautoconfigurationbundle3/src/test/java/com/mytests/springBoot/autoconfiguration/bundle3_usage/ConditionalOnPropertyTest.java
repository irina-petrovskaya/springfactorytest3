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
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ConditionalOnPropertyTest {

    @Autowired
    private Environment environment;




    @Autowired(required = false)
    private ConfigComponent10 configComponent10;
    @Autowired(required=false)
    private Bean10 bean10_from_configcomponent10;


    @Autowired(required = false)
    private ImportedConfig11 importedConfig11;
    @Autowired(required=false)
    private Bean11 bean11_from_importedconfig11;


    @Autowired(required = false)
    private ImportedConfig12 importedConfig12;
    @Autowired(required=false)
    private Bean12 bean12_from_importedconfig12;


    @Autowired(required = false)
    private ImportedConfig12.ImportedCfg12Inner importedCfg12Inner;
    @Autowired(required=false)
    private Bean15 bean15_from_importedcfg12inner;












    @Autowired(required = false)
    private ConfigComponent111 configComponent111;
    @Autowired(required = false)
    private Bean20 bean20_from_configcomp111;



// mainConfig1:
//
    @Autowired(required = false)
    private MainConfig1 mainConfig1;
    @Autowired(required=false)
    private Bean1 bean1_from_mainconfig1;

    // no conditions here except mainconfig1 condition
    @Autowired(required = false)
    private ImportedConfig13 importedConfig13;
    @Autowired(required = false)
    private Bean18 bean18_from_importedconfig13;

    // no conditions here except mainconfig1 condition
    @Autowired(required=false)
    private Bean17 bean17_from_xml;


    @Test
    public void testMainConfig1() {
        if(environment.getProperty("myprops.main1").equals("true")) {
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
// ConfigComponent11
//
    @Autowired(required = false)
    private ConfigComponent11 configComponent11;
    @Autowired(required = false)
    private ConfigComponent11.ConfComp11Inner confComp11Inner;
    @Autowired(required=false)
    private Bean16 bean16_from_confcomp11inner;

    @Test
    public void testConfigComponent11() {
        if((environment.getProperty("myprops.configcomp11").equals("true"))&&(environment.getProperty("myprops.configcomp11inner").equals("true"))) {
            System.out.println("conditions for confcomp11inner and configcomponent11 are ok:");
            System.out.println("bean16_from_confcomp11inner, configComponent11 and confComp11Inner beans should be available");

            Assert.assertNotNull(confComp11Inner);
            Assert.assertNotNull(configComponent11);
            Assert.assertNotNull(bean16_from_confcomp11inner);}
        else {

            System.out.println("conditions for confcomp11inner and configcomponent11 are broken:");
            System.out.println("bean16_from_confcomp11inner, configComponent11 and confComp11Inner beans should not be available");

            Assert.assertNull(configComponent11);
            Assert.assertNull(confComp11Inner);
            Assert.assertNull(bean16_from_confcomp11inner);
        }
    }
// Component10:
//
    @Autowired(required = false)
    private Component10 component10;
    @Autowired(required=false)
    private Bean13 bean13_from_component10;

    @Test
    public void testComponent10() {
        if(environment.getProperty("myprops.component10").equals("true"))
        {
            System.out.println("\"myprops.component10\"="+environment.getProperty("myprops.component10"));
            System.out.println("bean13_from_component10 and component10 are available");
            Assert.assertNotNull("component10",component10);
            Assert.assertNotNull("bean13_from_component10",bean13_from_component10);
        }
    }

// Component11:
//
    @Autowired(required = false)
    private Component11.Component11Inner component11Inner;
    @Autowired(required=false)
    private Bean14 bean14_from_component11inner;
    @Autowired(required = false)
    private Component11 component11;

    @Test
    public void testComponent11() {
        if(environment.getProperty("myprops.component11").equals("true")&&
                environment.getProperty("myprops.component11inner").equals("true"))
        {
            System.out.println("\"myprops.component11\"="+environment.getProperty("myprops.component11"));
            System.out.println("\"myprops.component11inner\"="+environment.getProperty("myprops.component11inner"));
            System.out.println("bean14_from_component11inner, component11inner and component11 are available");
            Assert.assertNotNull("component11",component11);
            Assert.assertNotNull("component11inner",component11Inner);
            Assert.assertNotNull("bean14_from_component11inner",bean14_from_component11inner);
        }
    }
}
