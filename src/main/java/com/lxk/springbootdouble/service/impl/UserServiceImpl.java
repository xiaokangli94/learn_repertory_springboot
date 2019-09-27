package com.lxk.springbootdouble.service.impl;


import com.lxk.springbootdouble.entity.db1.User;
import com.lxk.springbootdouble.mapper.db1.UserMapper;
import com.lxk.springbootdouble.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUserList() {
        return this.userMapper.selectUserList();
    }

    @Transactional
    @Override
    public void saveUser(User user) {
        this.userMapper.saveUser(user);
//        throw new RuntimeException();
    }
}
