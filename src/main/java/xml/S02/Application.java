package xml.S02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.S02.a.A;
import xml.S02.b.B;
import xml.S02.base.Base;

public class Application {

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("xml/S02/conf_a.xml", "xml/S02/conf_b.xml", "xml/S02/conf_base.xml");

        Base base = ac.getBean(Base.class);

        A a = base.getA();
        System.out.println(a.getValue());

        B b = base.getB();
        System.out.println(b.getValue());

        ((ClassPathXmlApplicationContext) ac).close();
    }

}
