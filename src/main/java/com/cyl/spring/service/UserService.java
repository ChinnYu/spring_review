package com.cyl.spring.service;

import com.cyl.spring.dao.IuserDao;

/**
 * @author : Liu
 * @Date : 2019/11/2 下午 06:34
 * @Description :
 */

public class UserService implements IUserService{

    private IuserDao userDao;

    public IuserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(IuserDao userDao) {
        this.userDao = userDao;
    }

    public UserService(IuserDao userDao) {
        this.userDao = userDao;
    }

    public UserService() {

    }
    public void add() {
        System.out.println("add");
        userDao.add();
    }
}
