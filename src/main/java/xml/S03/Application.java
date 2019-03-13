package xml.S03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xml.S03.a.A;
import xml.S03.b.B;
import xml.S03.base.Base;

@ImportResource({"classpath:xml/S03/conf.xml"})
@Configuration
public class Application {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Application.class);

        Base base = ac.getBean(Base.class);

        A a = base.getA();
        System.out.println(a.getValue());

        B b = base.getB();
        System.out.println(b.getValue());

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
