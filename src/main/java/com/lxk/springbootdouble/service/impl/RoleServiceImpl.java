package com.lxk.springbootdouble.service.impl;

import com.lxk.springbootdouble.entity.db2.Role;
import com.lxk.springbootdouble.mapper.db2.RoleMapper;
import com.lxk.springbootdouble.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public List<Role> selectRoleList() {
        return this.roleMapper.selectRoleList();
    }

    // 注：不是主数据源必须要声明其数据源，否则事务不起作用
    @Transactional(value = "db2TransactionManager")
    @Override
    public void saveRole(Role role) {
        this.roleMapper.saveRole(role);
//        throw new RuntimeException();
    }
}