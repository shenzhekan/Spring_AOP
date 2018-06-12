package com.szk.aspect.multi;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class Aspect2 {
	
	@Pointcut("execution(* com.szk.service..*.print*(..))")
	public void print() {}
	
	@Before("print()")
	public void before() {
		System.out.println("before 2...");
	}
	
	@After("print()")
	public void after() {
		System.out.println("after 2...");
	}
	
	@AfterReturning("print()")
	public void afterReturning() {
		System.out.println("afterReturning 2...");
	}
	

}