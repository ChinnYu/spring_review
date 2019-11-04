package com.cyl.spring.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author : Liu
 * @Date : 2019/11/4 下午 02:20
 * @Description :
 */
@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "com.cyl.spring")
public class AppConfig {

}
