import com.laoou.config.UserConfig;
import com.laoou.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
//        如果完全使用配置方法去做,我们只能通过AnnotationConfig上下文进行获取容器,通过配置类class对象加载
        ApplicationContext context = new AnnotationConfigApplicationContext(UserConfig.class);
        User getUser = (User) context.getBean("getUser");
        System.out.println(getUser.getName());
    }
}
