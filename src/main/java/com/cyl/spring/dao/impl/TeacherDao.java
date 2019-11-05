package com.cyl.spring.dao.impl;

import com.cyl.spring.dao.ITeacherDao;
import com.cyl.spring.entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

/**
 * @author : Liu
 * @Date : 2019/11/4 下午 11:23
 * @Description :
 */
@Component
public class TeacherDao extends JdbcDaoSupport implements ITeacherDao {

    @Autowired
    public void setJ(JdbcTemplate jdbcTemplate){
        super.setJdbcTemplate(jdbcTemplate);
    }

    public void add(Teacher teacher) {
        this.getJdbcTemplate().update("insert into t_teacher(name) values (?)",teacher.getName());
    }

    public void updata() {

    }
}
