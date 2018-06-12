package com.szk.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class RoleAspect {

	//@Pointcut("execution(* com.szk.service..*.print*(..))")      // 当前包及其子包下的所有类下以print开头的方法
	//@Pointcut("execution(* com.szk.service.RoleService.*(..))")    // 当前接口下的所有方法
	@Pointcut("execution(* com.szk.service.impl.*.print*(..))")    // 当前包下任意类中以print开头的方法
	public void print() {}
	
	@Before("print()")
	public void before() {
		System.out.println("before...");
	}
	
	@After("print()")
	public void after() {
		System.out.println("after...");
	}
	
	@AfterReturning("print()")
	public void afterReturning() {
		System.out.println("afterReturning...");
	}
	
/*	@AfterThrowing(value="print()", throwing="e")
	public void afterThrowing(Throwable e) {
		System.out.println("afterThrowing...");
		e.printStackTrace();
	}*/
	
	@AfterThrowing(value="print()")
	public void afterThrowing() {
		System.out.println("afterThrowing...");
	}
	
	@Around("print()")
	public void around(ProceedingJoinPoint p) {
		System.out.println("around before...");
		try {
			p.proceed();
		} catch (Throwable e) {
			
		}
		System.out.println("around after...");
	}
	
}
