package com.example.mybatisdemo.persistence.ext.mapper;

import com.example.mybatisdemo.persistence.auto.model.User;

import java.util.List;

/**
 * Created by Cisco on 2018/10/29
 */
public interface UserExtMapper {
    List<User> getUserList();
}
