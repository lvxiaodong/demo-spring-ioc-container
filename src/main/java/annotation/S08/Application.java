package annotation.S08;

import annotation.S08.a.A;
import annotation.S08.b.B;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.getEnvironment().setActiveProfiles("dev");
        ac.register(Application.class);
        ac.refresh();

        A a = ac.getBean(A.class);
        System.out.println(a.getValue());

        B b = ac.getBean(B.class);
        System.out.println(b.getValue());

        ac.close();
    }

}
