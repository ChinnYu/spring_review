package com.cyl.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author : Liu
 * @Date : 2019/11/4 下午 01:01
 * @Description :
 * Aspect 切面
 * 範圍:切點,那些方面需要被增強
 * 增強的邏輯:具體加入甚麼增強
 */


@Aspect
@Component
public class MyAspect {
    @Before("execution(* com.cyl.spring.service.impl.*.*(..))")
    public void before(){
        System.out.println("前置增強,比如創建連接對象");
    }

    @After("execution(* com.cyl.spring.service.impl.UserService.*(..))")
    public void after(){
        System.out.println("後置增強,比如關閉連接對象");
    }
}
