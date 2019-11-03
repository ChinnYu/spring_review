package com.cyl.spring.proxy;

import com.cyl.spring.server.IServerManager;
import com.cyl.spring.server.TransactionManager;
import com.cyl.spring.service.IUserService;

/**
 * @author : Liu
 * @Date : 2019/11/3 下午 03:33
 * @Description :
 */

public class UserServiceStaticProxy implements IUserService {

    //代理對象
    private IUserService target;

    //邀加入的業務增強,比如紀錄時間
    private IServerManager serverManager;
    //通過構造方法傳入具體要代裡的物件
    public UserServiceStaticProxy(IUserService target,IServerManager serverManager){
        this.target = target;
        this.serverManager = serverManager;
    }
    public void add() {
        //非核心業務
        serverManager.before();
        //核心活-目標對象來做
        target.add();
        serverManager.after();
    }

    public void other() {
        //非核心業務
        serverManager.before();
        //核心活-目標對象來做
        target.add();
        serverManager.after();
    }
}
