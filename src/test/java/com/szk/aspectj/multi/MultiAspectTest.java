package com.szk.aspectj.multi;

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
public class MultiAspectTest {

	@Autowired
	@Qualifier("role")
	private Role role;
	
	@Autowired
	@Qualifier("roleServiceImpl")
	private RoleService roleServiceImpl;

	public void setRole(Role role) {
		this.role = role;
	}

	public void setRoleServiceImpl(RoleService roleServiceImpl) {
		this.roleServiceImpl = roleServiceImpl;
	}

	@Test
	public void test1() {
		role.setId(2);
		role.setName("smy");
		role.setNote("note_2");
		roleServiceImpl.printRole(role);
	}
	
}
