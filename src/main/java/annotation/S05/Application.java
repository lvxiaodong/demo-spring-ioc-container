package annotation.S05;

import annotation.S05.a.A;
import annotation.S05.user.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Application.class);

        A a = ac.getBean("a", A.class);
        System.out.println(a.getValue());

        a = ac.getBean("a1", A.class);
        System.out.println(a.getValue());

        User user = ac.getBean(User.class);
        user.print();

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
