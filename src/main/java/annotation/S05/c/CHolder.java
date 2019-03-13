package annotation.S05.c;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class CHolder {

    @Qualifier("c2")
    @Autowired
    private C cxx;

    public void print() {
        System.out.println(cxx.getValue());
    }
}
