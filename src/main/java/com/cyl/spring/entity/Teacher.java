package com.cyl.spring.entity;

import org.springframework.stereotype.Component;

/**
 * @author : Liu
 * @Date : 2019/11/4 下午 06:04
 * @Description :
 */

public class Teacher {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
