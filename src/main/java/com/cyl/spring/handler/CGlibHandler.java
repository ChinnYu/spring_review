package com.cyl.spring.handler;

import com.cyl.spring.server.IServerManager;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author : Liu
 * @Date : 2019/11/3 下午 07:41
 * @Description :
 */

/**
 *  MethodInterceptor : 方法攔截器
 *  目標: 將非核心業務邏輯加入到核心業務邏輯上
 */
public class CGlibHandler implements MethodInterceptor {

    private IServerManager serverManager;

    public CGlibHandler(IServerManager serverManager) {
        this.serverManager = serverManager;
    }

    //方法什麼時候被調用
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        serverManager.before();
        //invokeSuper 調用父類的方法
        Object result = methodProxy.invokeSuper(o,objects);
        serverManager.after();
        return result;
    }
}
