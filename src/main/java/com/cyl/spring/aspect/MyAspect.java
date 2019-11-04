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



public class MyAspect {

    public void before(){
        System.out.println("前置增強,比如創建連接對象");
    }


    public void after(){
        System.out.println("後置增強,比如關閉連接對象");
    }
}
