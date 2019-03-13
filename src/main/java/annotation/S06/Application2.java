package annotation.S06;

import annotation.S06.user.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application2 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Application2.class);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        User user = ac.getBean(User.class);
        System.out.println(user.getB());
        System.out.println(user.getB());

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
