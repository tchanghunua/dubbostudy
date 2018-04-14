package com.huazi.dubbo.demo;

import com.alibaba.demo.UserService;

public class UserServiceImpl implements UserService {
    @Override
    public String sayHi(String s) {
        return "hello " + s + "!";
    }
}
