package annotation.S03;

import annotation.S03.conf.ConfConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application2 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ConfConfiguration.class);

        ConfConfiguration cc = ac.getBean(ConfConfiguration.class);
        System.out.println(cc.b());
        System.out.println(cc.b());

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
