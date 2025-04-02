package com.xiaowang.xwblog.mapper;

import com.xiaowang.xwblog.entity.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    User findByUsername(String username);
    void insert(User user);
}