package com.kgisl.sb311aop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class Sb311aopApplication {

	public static void main(String[] args) {
		SpringApplication.run(Sb311aopApplication.class, args);
	}

}
