package annotation.S04;

import annotation.S04.a.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"annotation.S04"})
public class Application {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Application.class);

        A a = ac.getBean(A.class);
        System.out.println(a.getValue());

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
