package annotation.S02.conf;

import annotation.S02.b.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfB {

    @Bean
    public B b() {
        B b = new B("b");
        return b;
    }

}
