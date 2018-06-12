package com.szk.service.impl;


import org.springframework.stereotype.Component;

import com.szk.service.RoleService;
import com.szk.vo.Role;

@Component
public class RoleServiceImpl implements RoleService {

	@Override
	public void printRole(Role role) {
		System.out.println("Role [id=" + role.getId()
						   + ", name=" + role.getName()
						   + ", note=" + role.getNote() + "]");
	}

}
