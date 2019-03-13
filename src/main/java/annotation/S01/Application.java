package annotation.S01;

import annotation.S01.conf.Conf;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import annotation.S01.a.A;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Conf.class);

        A a = ac.getBean("a", A.class);
        System.out.println(a.getValue());
        a.setValue(a.getValue() + 1);

        A a2 = (A) ac.getBean("a");
        System.out.println(a2.getValue());
        a2.setValue(a2.getValue() + 2);

        A a3 = ac.getBean(A.class);
        System.out.println(a3.getValue());

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
