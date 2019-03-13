package annotation.S08.conf;

import annotation.S08.a.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("dev")
@Configuration
@PropertySource("classpath:annotation/S08/app-dev.properties")
public class Conf {

    @Bean
    public A a(){
        A a = new A();
        a.setValue("development");
        return a;
    }
}
