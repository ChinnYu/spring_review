package com.cyl.spring.factory;

import com.cyl.spring.service.IUserService;
import com.cyl.spring.service.UserService;

/**
 * @author : Liu
 * @Date : 2019/11/2 下午 07:45
 * @Description :
 */

public class UserServiceStaticFactory {
    private static IUserService userService = new UserService();
    public static IUserService getInstance(){
        return userService;
    }
}
