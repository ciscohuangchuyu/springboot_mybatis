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
import sun.print.resources.serviceui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 新增数据测试
 * Created by Cisco on 2018/10/28
 */
@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
public class AddDataTest {
    @Autowired
    private UserMapper userMapper;
    private static int count = 0;
    @Test
    public void run1() {
        ExecutorService service = Executors.newFixedThreadPool(55);
        long start = System.currentTimeMillis();
        for (int i =0; i < 55; i++) {
            User user = new User();
            user.setPassword("123456");
            user.setPhone("18312755572");
            user.setUserName("cisco" + i + "号");
            service.execute(new AddDataThread(user));
        }
        service.shutdown();
        while(!service.isTerminated()) {
        }
        long end = System.currentTimeMillis();
        log.info("执行完成,共耗时: " + (end - start) +"ms" );
    }

    @Test
    public void run2() {
        System.out.println(userMapper);
    }

    private void add(User user) {
        userMapper.insert(user);
    }

    @Test
    public void run3() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user);
    }

    class AddDataThread implements Runnable{
        private User user;
        public AddDataThread(User user) {
            this.user = user;
        }
        @Override
        public void run() {
                add(user);
        }
    }
}
