package com.cyl.spring.dao.impl;

import com.cyl.spring.dao.ITeacherDao;
import com.cyl.spring.entity.Teacher;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author : Liu
 * @Date : 2019/11/4 下午 11:23
 * @Description :
 */

public class TeacherDao implements ITeacherDao {

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
