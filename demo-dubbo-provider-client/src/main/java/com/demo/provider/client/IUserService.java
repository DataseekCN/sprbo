package com.demo.provider.client;

import com.demo.provider.dto.co.UserInfoCO;
import com.demo.provider.dto.qry.UserInfoQry;

/**
 * user interface
 *
 * @create 2018-10-17
 **/
public interface IUserService {

    /**
     * get user info
     *
     * @param query
     *
     * @return
     */
    UserInfoCO getUserInfo(UserInfoQry query);
}
