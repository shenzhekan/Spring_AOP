package com.szk.aspect.multi;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(3)
public class Aspect3 {
	
	@Pointcut("execution(* com.szk.service..*.print*(..))")
	public void print() {}
	
	@Before("print()")
	public void before() {
		System.out.println("before 3...");
	}
	
	@After("print()")
	public void after() {
		System.out.println("after 3...");
	}
	
	@AfterReturning("print()")
	public void afterReturning() {
		System.out.println("afterReturning 3...");
	}
	

}
