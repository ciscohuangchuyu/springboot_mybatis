package com.example.mybatisdemo.facade.model.req;

import lombok.Data;

/**
 * Created by Cisco on 2018/10/31
 */
@Data
public class GetUserListRequest {
    private String userName;
    private String phone;
    private String userStatus;
}
