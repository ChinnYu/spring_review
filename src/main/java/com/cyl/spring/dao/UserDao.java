package com.cyl.spring.dao;

import org.springframework.stereotype.Component;

/**
 * @author : Liu
 * @Date : 2019/11/2 下午 08:55
 * @Description :
 */
@Component
public class UserDao implements IuserDao{


    public void add() {
        System.out.println("add");
    }
}
