package com.example.mybatisdemo.test;

import com.example.mybatisdemo.biz.service.UserService;
import com.example.mybatisdemo.persistence.auto.mapper.UserMapper;
import com.example.mybatisdemo.persistence.auto.model.User;
import com.example.mybatisdemo.persistence.ext.mapper.UserExtMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * 查询测试
 * Created by Cisco on 2018/10/29
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
public class UserControllerTest {
    @Autowired
    private UserExtMapper userExtMapper;
    @Autowired
    private UserMapper userMapper;
    @Autowired
    private UserService userService;

    @Test
    public void getUserList() { // 获取用户列表不统计总数
        PageHelper.startPage(2,6,false);
        List<User> test = userService.getUserList();
        PageInfo<User> userPageInfo = new PageInfo<>();
        List<User> list = userPageInfo.getList();
        Assert.assertNotNull(test);
        log.warn("111");
        log.error("发生大龙凤hi的");
    }
    @Test
    public void run1() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }
}
