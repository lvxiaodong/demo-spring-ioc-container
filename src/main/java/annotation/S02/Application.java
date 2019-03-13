package annotation.S02;

import annotation.S02.a.A;
import annotation.S02.b.B;
import annotation.S02.base.Base;
import annotation.S02.conf.ConfA;
import annotation.S02.conf.ConfB;
import annotation.S02.conf.ConfBase;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ConfA.class, ConfB.class, ConfBase.class);

        Base base = ac.getBean(Base.class);

        A a = base.getA();
        System.out.println(a.getValue());

        B b = base.getB();
        System.out.println(b.getValue());

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
