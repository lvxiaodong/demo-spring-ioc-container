package annotation.S08.conf;

import annotation.S08.a.A;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("prod")
@Configuration
@PropertySource("classpath:annotation/S08/app-prod.properties")
public class Conf2 {

    @Bean
    public A a(){
        A a = new A();
        a.setValue("production");
        return a;
    }
}
