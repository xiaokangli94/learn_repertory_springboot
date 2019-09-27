package com.lxk.springbootdouble.mapper.db1;


import com.lxk.springbootdouble.entity.db1.QuartzConfig;

import java.util.List;

public interface QuartzConfigMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(QuartzConfig record);

    int insertSelective(QuartzConfig record);

    QuartzConfig selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(QuartzConfig record);

    int updateByPrimaryKey(QuartzConfig record);

    List<QuartzConfig> queryAll();
}