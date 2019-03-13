package annotation.S03;

import annotation.S03.a.A;
import annotation.S03.user.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(A.class, User.class);

        User user = ac.getBean(User.class);
        user.printA();

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
