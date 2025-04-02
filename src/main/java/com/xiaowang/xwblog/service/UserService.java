package com.xiaowang.xwblog.service;

import com.xiaowang.xwblog.entity.User;
import com.xiaowang.xwblog.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public void register(User user) {
        // 检查用户名是否已存在
        if (userMapper.findByUsername(user.getUsername()) != null) {
            throw new RuntimeException("用户名已存在");
        }
        // 密码加密
        user.setPassword(encodePassword(user.getPassword()));
        userMapper.insert(user);
    }

    public User login(User user) {
        User dbUser = userMapper.findByUsername(user.getUsername());
        if (dbUser == null || !dbUser.getPassword().equals(encodePassword(user.getPassword()))) {
            throw new RuntimeException("用户名或密码错误");
        }
        return dbUser;
    }

    public User getUserByUsername(String username) {
        return userMapper.findByUsername(username);
    }

    private String encodePassword(String password) {
        // 实际项目中应该使用更安全的加密方式如BCrypt
        return password;
    }
}