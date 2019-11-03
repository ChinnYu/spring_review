package com.cyl.spring.server;

/**
 * @author : Liu
 * @Date : 2019/11/3 下午 03:30
 * @Description :
 */

public class TransactionManager implements IServerManager{

    public void before(){
        System.out.println("Transaction before");
    }

    public void after(){
        System.out.println("Transaction after");
    }

}
