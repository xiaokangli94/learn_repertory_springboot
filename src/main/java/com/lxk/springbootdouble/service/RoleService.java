package com.lxk.springbootdouble.service;



import com.lxk.springbootdouble.entity.db2.Role;

import java.util.List;

public interface RoleService {

    List<Role> selectRoleList();

    void saveRole(Role role);

}