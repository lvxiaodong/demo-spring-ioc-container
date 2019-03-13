package annotation.S07;

import annotation.S07.a.A;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan
@PropertySource("classpath:annotation/S07/app.properties")
public class Application {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Application.class);

        A a = ac.getBean(A.class);
        System.out.println(a.getValue());

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
