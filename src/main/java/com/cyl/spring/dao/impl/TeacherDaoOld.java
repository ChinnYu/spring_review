package com.cyl.spring.dao.impl;

import com.cyl.spring.dao.ITeacherDao;
import com.cyl.spring.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

/**
 * @author : Liu
 * @Date : 2019/11/4 下午 11:23
 * @Description :
 */

public class TeacherDaoOld implements ITeacherDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public void add(Teacher teacher) {
        jdbcTemplate.update("insert into t_teacher(name) values (?)",teacher.getName());
    }

    public void updata() {

    }
}
