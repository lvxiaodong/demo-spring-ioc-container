package annotation.S06.b;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BHolder {

    @Autowired
    private B b1;

    @Autowired
    private B b2;

    public void print() {
        System.out.println(b1);
        System.out.println(b2);
    }
}
