import com.laoou.UserDao.UserDaoImpl;
import com.laoou.UserDao.UserMysqlDaoImpl;
import com.laoou.service.UserService;
import com.laoou.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
//        UserService userService = new UserServiceImpl();
//        ((UserServiceImpl) userService).setUserDao(new UserMysqlDaoImpl());
//        userService.getUser();

//        获取ApplicationContext;拿到spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//          当容器在手时，需要什么，直接get什么
        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }
}
