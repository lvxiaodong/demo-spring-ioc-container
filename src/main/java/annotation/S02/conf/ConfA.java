package annotation.S02.conf;

import annotation.S02.a.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration()
public class ConfA {

    @Bean
    public A a() {
        A a = new A();
        a.setValue("a");
        return a;
    }

}
