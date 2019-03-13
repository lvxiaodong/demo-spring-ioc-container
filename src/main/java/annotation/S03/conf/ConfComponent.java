package annotation.S03.conf;

import annotation.S03.b.B;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class ConfComponent {

    @Bean
    public B b() {
        return new B();
    }

}
