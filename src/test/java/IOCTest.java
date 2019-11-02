import com.cyl.spring.service.IUserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Liu
 * @Date : 2019/11/2 下午 06:40
 * @Description :
 */

public class IOCTest {

    @Test
    public void iocTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IUserService userService =  (IUserService) ctx.getBean("userService");
        IUserService userService = ctx.getBean(IUserService.class);
        userService.add();
    }
}
