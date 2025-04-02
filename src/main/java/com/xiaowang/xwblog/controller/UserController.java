package com.xiaowang.xwblog.controller;

import com.xiaowang.xwblog.entity.User;
import com.xiaowang.xwblog.service.UserService;
import com.xiaowang.xwblog.util.JwtUtil;import com.xiaowang.xwblog.util.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public Result register(@RequestBody User user) {
        userService.register(user);
        return Result.success(user);
    }

    @PostMapping("/login")
    public Result login(@RequestBody User user) {
        User loginUser = userService.login(user);
        String token = JwtUtil.generateToken(loginUser);
        return Result.success("token", token).success("userInfo", loginUser);
    }

    @GetMapping("/info")
    public Result getInfo(@RequestHeader("Authorization") String token) {
        String username = JwtUtil.getUsernameFromToken(token);
        User user = userService.getUserByUsername(username);
        return Result.success(user);
    }
}