package annotation.S05;

import annotation.S05.c.CHolder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application3 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Application3.class);

        CHolder ch = ac.getBean(CHolder.class);
        ch.print();

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
