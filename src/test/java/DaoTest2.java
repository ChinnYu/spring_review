import com.cyl.spring.dao.ITeacherDao;
import com.cyl.spring.entity.Teacher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author : Liu
 * @Date : 2019/11/5 下午 11:25
 * @Description :
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class DaoTest2 {

    @Autowired
    private ITeacherDao teacherDao;
    @Test
    public void addTest(){
        Teacher teacher = new Teacher();
        teacher.setName("jason");
        teacherDao.add(teacher);
    }

}
