package com.cyl.spring.service;

import com.cyl.spring.dao.IuserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author : Liu
 * @Date : 2019/11/2 下午 06:34
 * @Description :
 */
@Component
public class UserService implements IUserService{


    public void add() {
        System.out.println("add");
//        userDao.add();
    }

    public void other() {
        System.out.println("oadd");
    }
}
