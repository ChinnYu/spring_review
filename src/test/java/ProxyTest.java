import com.cyl.spring.handler.CGlibHandler;
import com.cyl.spring.handler.MyInvocationHandler;
import com.cyl.spring.server.IServerManager;
import com.cyl.spring.server.OtherManager;
import com.cyl.spring.server.TransactionManager;
import com.cyl.spring.service.IOtherService;
import com.cyl.spring.service.IUserService;
import com.cyl.spring.service.UserService;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

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
        //創建處理器,負責將非核心業務和核心業務邏輯組合到一起
        CGlibHandler handler = new CGlibHandler(serverManager1);
        //通過cglibg生成目標對象的子類,來動態創建代裡對象
        Enhancer enhancer = new Enhancer();
        //父類
        enhancer.setSuperclass(target.getClass());
        //設置處理邏輯
        enhancer.setCallback(handler);
        //生成代理類(目標類的子類)
        IUserService proxy = (IUserService) enhancer.create();
        proxy.add();
    }

    @Test
    public void proxyTest2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        IUserService userService =  (IUserService) ctx.getBean("userService");
        IOtherService target = ctx.getBean(IOtherService.class);
        //創建非核心業務增強對象
        IServerManager serverManager1 = new TransactionManager();
        //創建處理器,負責將非核心業務和核心業務邏輯組合到一起
        InvocationHandler handler = new MyInvocationHandler(target,serverManager1);
        //通過jdk提供的反射技術來動態創建代裡對象
        IOtherService proxy = (IOtherService) Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),handler);
        proxy.delete();
    }
}
