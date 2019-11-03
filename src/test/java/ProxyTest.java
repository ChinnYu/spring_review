import com.cyl.spring.proxy.UserServiceStaticProxy;
import com.cyl.spring.server.IServerManager;
import com.cyl.spring.server.OtherManager;
import com.cyl.spring.server.TransactionManager;
import com.cyl.spring.service.IUserService;
import com.cyl.spring.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author : Liu
 * @Date : 2019/11/3 下午 03:28
 * @Description :
 */

public class ProxyTest {

    @Test
    public void proxyTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IUserService userService =  (IUserService) ctx.getBean("userService");
        IUserService target = ctx.getBean(IUserService.class);
        //創建非核心業務增強對象
        IServerManager serverManager1 = new TransactionManager();
        IServerManager serverManager2 = new OtherManager();
        //代理對象
        IUserService proxy = new UserServiceStaticProxy(target,serverManager1);
        IUserService proxy2 = new UserServiceStaticProxy(proxy,serverManager2);
        proxy.add();
        proxy2.add();
    }
}
