package com.mytests.springBoot.autoconfiguration.bundle3_usage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@EnableConfigurationProperties
@Import(ConditionalBeansConfig.class)
public class UseMyautoconfigurationbundle3Application implements CommandLineRunner {

    private final ApplicationContext ctx;



    @Autowired
	public UseMyautoconfigurationbundle3Application(ApplicationContext ctx) {
		this.ctx = ctx;
	}



	public static void main(String[] args) {
		SpringApplication.run(UseMyautoconfigurationbundle3Application.class, args);
	}

	@Override
	public void run(String... strings) throws Exception {
		String[] beans = ctx.getBeanDefinitionNames();
		System.out.println("**************************************************************************");
		for (String _bean : beans) {
			if(_bean.toString().startsWith("bean")){System.out.println(_bean);}
		}
		System.out.println("**************************************************************************");
	}
}