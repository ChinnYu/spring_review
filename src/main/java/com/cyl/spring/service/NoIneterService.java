package com.cyl.spring.service;

import org.springframework.stereotype.Component;

/**
 * @author : Liu
 * @Date : 2019/11/2 下午 06:34
 * @Description :
 */
@Component
public class NoIneterService {

    public void add() {
        System.out.println("add");
//        userDao.add();
    }

    public void other() {
        System.out.println("oadd");
    }
}
