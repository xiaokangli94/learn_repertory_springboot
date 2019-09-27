package com.lxk.springbootdouble.mapper.db1;


import com.lxk.springbootdouble.entity.db1.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUserList();

    void saveUser(User user);

}
