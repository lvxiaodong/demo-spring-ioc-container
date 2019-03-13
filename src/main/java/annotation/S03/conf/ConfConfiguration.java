package annotation.S03.conf;

import annotation.S03.b.B;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfConfiguration {

    @Bean
    public B b() {
        return new B();
    }

/*
    public B newB() {
        B b = cache.get(B.class);
        if (b==null) {
            return b();
        } else {
            return b;
        }
    }*/
}
