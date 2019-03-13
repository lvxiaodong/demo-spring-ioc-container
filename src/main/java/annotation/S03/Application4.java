package annotation.S03;

import annotation.S03.user.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application4 {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("annotation/S03/conf.xml");

        User user = ac.getBean(User.class);
        user.printA();

        ((ClassPathXmlApplicationContext) ac).close();
    }

}
