package annotation.S06.b;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Scope("prototype")
@Component
public class B {

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
