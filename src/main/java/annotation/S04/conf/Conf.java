package annotation.S04.conf;

import annotation.S04.a.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Conf {

    @Bean
    public A a() {
        A a = new A();
        a.setValue("a");
        return a;
    }

}
