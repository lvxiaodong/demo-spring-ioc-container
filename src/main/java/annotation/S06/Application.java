package annotation.S06;

import annotation.S06.a.AHolder;
import annotation.S06.b.BHolder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(Application.class);

        AHolder ah = ac.getBean(AHolder.class);
        ah.print();

        BHolder bh = ac.getBean(BHolder.class);
        bh.print();

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
