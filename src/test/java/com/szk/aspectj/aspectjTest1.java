package com.szk.aspectj;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.szk.service.RoleService;
import com.szk.vo.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class aspectjTest1 {

	@Autowired
	@Qualifier("role")
	private Role role;
	
	@Autowired
	@Qualifier("roleServiceImpl")
	private RoleService roleServiceImpl;          
	// ！！！这里是接口的引用，因为自动代理后不再是RoleServiceImpl,而是实现了RoleService接口的一个代理类
	
    /*	
	public void setRole(Role role) {
		this.role = role;
	}


	public void setRoleService(RoleService roleServiceImpl) {
		this.roleService = roleServiceImpl;
	}*/


	/**
	 * 前置通知，后置通知，环绕通知，异常通知，返回通知
	 */
	@Test
	public void testAspectj1() {
		role.setId(1); 
		role.setName("role_1");
		role.setNote("note_1");
		roleServiceImpl.printRole(role);
		System.out.println("----------------------");
		// 测试异常通知
		role = null;
		roleServiceImpl.printRole(role);
	}
	
	
	@Test
	public void testAspectj2() {
		role.setId(1); 
		role.setName("role_1");
		role.setNote("note_1");
		roleServiceImpl.printRole(role);
	}
	
}
