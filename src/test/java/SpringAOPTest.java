
import com.cyl.spring.config.AppConfig;
import com.cyl.spring.service.IOtherService;
import com.cyl.spring.service.IUserService;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @author : Liu
 * @Date : 2019/11/3 下午 03:28
 * @Description :
 */

public class SpringAOPTest {

    @Test
    public void aopTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IUserService userService =  (IUserService) ctx.getBean("userService");
        IUserService service = ctx.getBean(IUserService.class);
        service.add();
    }

    @Test
    public void aopTest2(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        IUserService service = ctx.getBean(IUserService.class);
        service.add();
    }
}
