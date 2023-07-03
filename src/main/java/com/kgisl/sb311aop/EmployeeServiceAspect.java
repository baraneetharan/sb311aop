package com.kgisl.sb311aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {

        Logger LOGGER = LoggerFactory.getLogger(this.getClass());


	@Before(value = "execution(* com.kgisl.sb311aop.service.EmployeeService.*(..)) and args(name,empId)")
	public void beforeAdvice(JoinPoint joinPoint, String name, String empId) {
		System.out.println("Before method:" + joinPoint.getSignature());
        LOGGER.info("Before method:" + joinPoint.getSignature());

		System.out.println("Creating Employee with name - " + name + " and id - " + empId);
        LOGGER.info("Creating Employee with name - " + name + " and id - " + empId);
	}

	@After(value = "execution(* com.kgisl.sb311aop.service.EmployeeService.*(..)) and args(name,empId)")
	public void afterAdvice(JoinPoint joinPoint, String name, String empId) {
		System.out.println("After method:" + joinPoint.getSignature());
        LOGGER.info("After method:" + joinPoint.getSignature());

        System.out.println("Successfully created Employee with name - " + name + " and id - " + empId);
		LOGGER.info("Successfully created Employee with name - " + name + " and id - " + empId);
	}
}