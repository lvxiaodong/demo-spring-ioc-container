package annotation.S03;

import annotation.S03.conf.ConfComponent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application3 {

    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(ConfComponent.class);

        ConfComponent cc = ac.getBean(ConfComponent.class);
        System.out.println(cc.b());
        System.out.println(cc.b());

        ((AnnotationConfigApplicationContext) ac).close();
    }

}
