package com.example.mybatisdemo.biz.service;

import com.example.mybatisdemo.persistence.auto.model.User;
import com.example.mybatisdemo.persistence.ext.mapper.UserExtMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户操作业务类
 * Created by Cisco on 2018/10/31
 */
@Service
@Slf4j
public class UserService {
    @Autowired
    private UserExtMapper userExtMapper;

    /**
     * 查询用户无分页
     * @return
     */
    public List<User> getUserList() {
        return userExtMapper.getUserList();
    }
}
