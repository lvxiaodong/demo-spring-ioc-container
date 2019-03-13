package annotation.S05.conf;

import annotation.S05.a.A;
import annotation.S05.b.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class Conf {

    @Bean
    public A a() {
        A a = new A();
        a.setValue("a");
        return a;
    }

    @Bean
    public A a1() {
        A a = new A();
        a.setValue("a1");
        return a;
    }

    @Bean
    public B b() {
        B b = new B();
        b.setValue("b");
        return b;
    }

    @Primary
    @Bean
    public B b1() {
        B b = new B();
        b.setValue("b1");
        return b;
    }

}
