package annotation.S02.conf;

import annotation.S02.a.A;
import annotation.S02.b.B;
import annotation.S02.base.Base;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfBase {

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public Base base(A a, B b) {
        Base base = new Base(a);
        base.setB(b);
        return base;
    }

}
