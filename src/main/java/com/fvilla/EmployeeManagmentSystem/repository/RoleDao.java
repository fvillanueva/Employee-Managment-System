package com.fvilla.EmployeeManagmentSystem.repository;

import com.fvilla.EmployeeManagmentSystem.entity.Role;

public interface RoleDao {

    public Role findRoleByName(String theRoleName);

}
