package annotation.S08;

import annotation.S08.a.A;
import annotation.S08.b.B;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class ApplicationProd {

    // 启动参数指定profile
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Application.class);

        A a = ac.getBean(A.class);
        System.out.println(a.getValue());

        B b = ac.getBean(B.class);
        System.out.println(b.getValue());

        ((AnnotationConfigApplicationContext) ac).close();
    }

}