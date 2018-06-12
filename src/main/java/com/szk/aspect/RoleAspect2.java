package com.szk.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import com.szk.vo.Role;

/**
 * 切面编程：传参至切面方法
 * @author admin
 *
 */
@Aspect
public class RoleAspect2 {

	@Pointcut("execution(* com.szk.service..*.print*(..))")
	public void print() {}
	
	// 实现参数传入前置通知
	@Before("execution(* com.szk.service..*.print*(..)) && args(role)")
	public void before(Role role) {
		System.out.println("before..."+role.getName());
	}
	
	@After(value="print()")
	public void after() {
		System.out.println("after...");
	}
	
}
