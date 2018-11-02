package com.example.mybatisdemo.facade.api;

import com.example.mybatisdemo.biz.service.UserService;
import com.example.mybatisdemo.persistence.auto.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Cisco on 2018/10/31
 */
@RestController
@Slf4j
@Api(value = "用户管理")
@RequestMapping(value = "/user", produces = "application/json; charset=utf-8") //配置返回值
public class UserController {
    @Autowired
    private UserService userService;

    @ApiOperation(value = "获取用户列表", notes = "获取所有用户信息")
    @GetMapping(value = "getUserList")
    public @ResponseBody
    List<User> getUserList() {
        return userService.getUserList();
    }
}
