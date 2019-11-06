import com.cyl.spring.dao.ITeacherDao;
import com.cyl.spring.dao.impl.TeacherDao;
import com.cyl.spring.entity.Teacher;
import com.cyl.spring.service.ITeacherService;
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

public class DaoTemplateTest {

    @Test
    public void doTest(){
        //DBCP
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        ITeacherDao teacherDao = ctx.getBean(ITeacherDao.class);
        Teacher teacher = new Teacher();
        teacher.setName("lbj");
        teacherDao.add(teacher);



    }

    @Test
    public void serviceTest(){
        //啟動容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //獲取service
        ITeacherService service = ctx.getBean(ITeacherService.class);
        service.add();
    }
}
