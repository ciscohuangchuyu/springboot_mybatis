package com.example.mybatisdemo.test;

import com.example.mybatisdemo.persistence.auto.mapper.UserMapper;
import com.example.mybatisdemo.persistence.auto.model.User;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Cisco on 2018/10/28
 */

public class Test {
    @Autowired
    private UserMapper userMapper;
    @org.junit.Test
    public void run() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
