package com.lxk.springbootdouble.mapper.db2;


import com.lxk.springbootdouble.entity.db2.Role;

import java.util.List;

public interface RoleMapper {

    List<Role> selectRoleList();

    void saveRole(Role role);
}
