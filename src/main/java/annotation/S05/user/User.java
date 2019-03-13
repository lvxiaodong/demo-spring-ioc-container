package annotation.S05.user;

import annotation.S05.a.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private A a;

    @Autowired
    private A a1;

    public void print() {
        System.out.println(a.getValue());
        System.out.println(a1.getValue());
    }
}
