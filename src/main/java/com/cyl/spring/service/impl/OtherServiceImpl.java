package com.cyl.spring.service.impl;

import com.cyl.spring.service.IOtherService;
import org.springframework.stereotype.Component;

/**
 * @author : Liu
 * @Date : 2019/11/3 下午 04:55
 * @Description :
 */
@Component
public class OtherServiceImpl implements IOtherService {

    public void delete() {
        System.out.println("otherservice");
    }
}
