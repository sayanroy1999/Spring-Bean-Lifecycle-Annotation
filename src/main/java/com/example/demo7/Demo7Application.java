package com.example.demo7;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Demo7Application {

	public static void main(String[] args) {

		SpringApplication.run(Demo7Application.class, args);

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
		Example example=(Example) context.getBean("example");

		System.out.println(example);

		context.registerShutdownHook();
	}

}
