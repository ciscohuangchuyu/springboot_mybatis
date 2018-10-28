package com.example.mybatisdemo;

import com.example.mybatisdemo.persistence.auto.mapper.UserMapper;
import com.example.mybatisdemo.persistence.auto.model.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class MybatisdemoApplicationTests {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void contextLoads() {
        System.out.println(userMapper);
    }

    @Test
    public void run3() {
        User user = userMapper.selectByPrimaryKey(1);
    }


}
