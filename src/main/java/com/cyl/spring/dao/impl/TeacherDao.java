package com.cyl.spring.dao.impl;

import com.cyl.spring.dao.ITeacherDao;
import com.cyl.spring.entity.Teacher;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.stereotype.Component;

/**
 * @author : Liu
 * @Date : 2019/11/4 下午 11:23
 * @Description :
 */
@Component
public class TeacherDao extends HibernateDaoSupport implements ITeacherDao {

    @Autowired
    public void setSf(SessionFactory sessionFactory){
        super.setSessionFactory(sessionFactory);
    }

    public void add(Teacher teacher) {
        this.getHibernateTemplate().save(teacher);
    }

    public void updata() {

    }
}
