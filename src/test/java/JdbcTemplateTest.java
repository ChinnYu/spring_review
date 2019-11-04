import com.cyl.spring.dao.ITeacherDao;
import com.cyl.spring.dao.impl.TeacherDao;
import com.cyl.spring.entity.Teacher;
import org.apache.commons.dbcp.BasicDataSource;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author : Liu
 * @Date : 2019/11/4 下午 05:33
 * @Description :
 */

public class JdbcTemplateTest {

    @Test
    public void codingTest(){
        //DBCP
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/1803_hibernate");
        dataSource.setUsername("root");
        dataSource.setPassword("123");
        JdbcTemplate template = new JdbcTemplate(dataSource);
        //原生sql
        //添加,刪除,更新
//        template.update("insert into t_teacher(name) values ('jasonp')");
//        template.update("update t_teacher set name=? where id=2 ","Wang");
//        template.update("delete from  t_teacher where id=?",22);

        //查詢
        List<Teacher> list = template.query("select * from t_teacher", BeanPropertyRowMapper.newInstance(Teacher.class));
        for (Teacher t : list){
            System.out.println(t.getName());
        }
    }

    @Test
    public void xmlTest(){
        //DBCP
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        JdbcTemplate template = ctx.getBean(JdbcTemplate.class);
        //原生sql
        //添加,刪除,更新
//        template.update("insert into t_teacher(name) values ('jasonp')");
//        template.update("update t_teacher set name=? where id=2 ","Wang");
//        template.update("delete from  t_teacher where id=?",22);

        //查詢
        List<Teacher> list = template.query("select * from t_teacher", BeanPropertyRowMapper.newInstance(Teacher.class));
        for (Teacher t : list){
            System.out.println(t.getName());
        }
    }

    @Test
    public void doTest(){
        //DBCP
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITeacherDao teacherDao = ctx.getBean(ITeacherDao.class);
        Teacher teacher = new Teacher();
        teacher.setName("xqc");
        teacherDao.add(teacher);
    }
}
