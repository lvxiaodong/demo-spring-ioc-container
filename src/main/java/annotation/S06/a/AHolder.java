package annotation.S06.a;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AHolder {

    @Autowired
    private A a1;

    @Autowired
    private A a2;

    public void print() {
        System.out.println(a1);
        System.out.println(a2);
    }
}
