package com.mytests.springBoot.autoconfiguration;

import com.mytests.springBoot.autoconfiguration.beans.Bean0;
import com.mytests.springBoot.autoconfiguration.beans.Bean01;
import com.mytests.springBoot.autoconfiguration.beans.Bean02;
import com.mytests.springBoot.autoconfiguration.beans.Bean1;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ContainerConfig {

    @Bean
    public Bean0 bean0_from_containerconfig() {
        return new Bean0();
    }

    public static class InnerConfig1{
        @Bean
        public Bean01 bean01_from_innerconfig1() {
            return new Bean01();
        }

    }
    static class InnerConfig2{

        @Bean
        public Bean02 bean02_from_innerconfig2() {
            return new Bean02();
        }
    }
}
