package com.lxk.springbootdouble.service;



import com.lxk.springbootdouble.entity.db1.User;

import java.util.List;

public interface UserService {

    List<User> selectUserList();

    void saveUser(User user);

}