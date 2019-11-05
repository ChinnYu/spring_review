package com.cyl.spring.service.impl;

import com.cyl.spring.dao.ITeacherDao;
import com.cyl.spring.entity.Teacher;
import com.cyl.spring.service.ITeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @author : Liu
 * @Date : 2019/11/5 下午 01:47
 * @Description :
 */
@Component
public class TeacherServiceImpl implements ITeacherService {

//    @Autowired
//    private TransactionTemplate transactionTemplate;

    @Autowired
    private ITeacherDao teacherDao;

    public void add() {
//        transactionTemplate.execute(new TransactionCallback<Object>() {
//
//            public Object doInTransaction(TransactionStatus transactionStatus) {
                Teacher t1 = new Teacher();
                t1.setName("applewww");
                teacherDao.add(t1);

                //中間發生異常
//                int i =1/0;
                Teacher t2 = new Teacher();
                t2.setName("apple2ww");
                teacherDao.add(t2);
                teacherDao.add(t2);
//                return null;
            }
//        });
//
//    }
}
