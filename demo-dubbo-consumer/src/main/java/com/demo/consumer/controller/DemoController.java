package com.demo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.demo.provider.client.IUserService;
import com.demo.provider.dto.co.UserInfoCO;
import com.demo.provider.dto.qry.UserInfoQry;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @create 2018-10-17
 **/
@RestController
public class DemoController {

    @Reference
    IUserService userService;

    @GetMapping("user/{name}")
    public UserInfoCO getUserByName(@PathVariable(name = "name") String name) {
        UserInfoQry query = new UserInfoQry();
        query.setName(name);
        return userService.getUserInfo(query);
    }
}
