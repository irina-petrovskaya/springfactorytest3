package com.mytests.springBoot.autoconfiguration.bundle3_usage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 2/19/2018.
 * Project: springfactorytest3
 * *******************************
 */
@Configuration
public class ConditionalBeansConfig {

    @Bean(name= "main2_condition")
    public String b0() {
        return "mainconfig2_condition";
    }

    @Bean(name= "main1_condition")
    public String b1() {
        return "mainconfig1_condition";
    }

    @Bean(name= "confcomp11_condition")
    public String b2() {
        return "";
    }
    @Bean(name= "confcomp11inner_condition")
    public String b3() {
        return "";
    }
    @Bean(name= "confcomp10_condition")
    public String b4() {
        return "";
    }
    @Bean(name= "component11inner_condition")
    public String b5() {
        return "";
    }
    @Bean(name= "component11_condition")
    public String b6() {
        return "";
    }

    @Bean(name="comp10_condition")
    public String s7() {
        return "";
    }

    @Bean(name="confcomp111_condition")
    public String s8() {
        return "";
    }
    @Bean(name="impconf12inner_condition")
    public String s9() {
        return "";
    }
    @Bean(name="impconf12_condition")
    public String s10() {
        return "";
    }
    @Bean(name="impconf11_condition")
    public String s11() {
        return "";
    }
}
