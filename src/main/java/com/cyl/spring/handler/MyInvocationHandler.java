package com.cyl.spring.handler;

import com.cyl.spring.server.IServerManager;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author : Liu
 * @Date : 2019/11/3 下午 05:27
 * @Description :
 */



public class MyInvocationHandler implements InvocationHandler {

    private Object target;
    private IServerManager serverManager;

    public MyInvocationHandler(Object target,IServerManager serverManager){
        this.target = target;
        this.serverManager = serverManager;
    }
    //invoke:調用
    //method:被調用的方法
    //args:被調用的目標方法的方法參數
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        serverManager.before();
        //核心
        Object result = method.invoke(target,args);
        serverManager.after();
        return result;
    }
}
