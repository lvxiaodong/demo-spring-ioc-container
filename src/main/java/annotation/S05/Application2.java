package annotation.S05;

import annotation.S05.a.A;
import annotation.S05.b.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application2 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Application2.class);

        B b = ac.getBean(B.class);
        System.out.println(b.getValue());

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
