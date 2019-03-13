package annotation.S03.user;

import annotation.S03.a.A;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class User {

    @Autowired
    private A a;

    @Autowired
    private A a1;

    public void printA() {
        System.out.println("a: " + a);
        System.out.println("a1: " + a1);
    }

    public void setA(A a) {
        this.a = a;
    }

    public void setA1(A a1) {
        this.a1 = a1;
    }
}
