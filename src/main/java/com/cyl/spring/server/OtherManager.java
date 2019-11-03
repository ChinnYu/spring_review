package com.cyl.spring.server;

/**
 * @author : Liu
 * @Date : 2019/11/3 下午 03:30
 * @Description :
 */

public class OtherManager implements IServerManager{

    public void before(){
        System.out.println("oTransaction before");
    }

    public void after(){
        System.out.println("oTransaction after");
    }

}
