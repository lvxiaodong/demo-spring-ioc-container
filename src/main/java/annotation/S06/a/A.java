package annotation.S06.a;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class A {

    private String value;

    @PostConstruct
    public void init() {
        System.out.println("init: " + this.toString());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("destroy: " + this.toString());
    }

}
