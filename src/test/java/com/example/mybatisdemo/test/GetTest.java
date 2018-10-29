package com.example.mybatisdemo.test;

import com.example.mybatisdemo.persistence.auto.model.User;
import com.example.mybatisdemo.persistence.ext.mapper.UserExtMapper;
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
public class GetTest {
    @Autowired
    private UserExtMapper userExtMapper;

    @Test
    public void getUserList() {
        List<User> test = userExtMapper.test();
        Assert.assertNotNull(test);
        log.info(test.get(0).toString());
    }
}
