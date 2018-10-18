package com.demo.provider.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.demo.provider.client.IUserService;
import com.demo.provider.dto.co.UserInfoCO;
import com.demo.provider.dto.qry.UserInfoQry;
import com.demo.provider.model.UserDO;
import org.springframework.beans.BeanUtils;

/**
 * demo
 *
 * @create 2018-10-17
 **/
@Service
public class UserServiceImpl implements IUserService {

    /**
     * get user info
     *
     * @param query
     *
     * @return
     */
    @Override
    public UserInfoCO getUserInfo(UserInfoQry query) {
        UserDO user = new UserDO();
        user.setId(1L);
        user.setName("lucy");
        user.setAge(20);
        UserInfoCO clientObject = new UserInfoCO();
        BeanUtils.copyProperties(user, clientObject);
        return clientObject;
    }
}
