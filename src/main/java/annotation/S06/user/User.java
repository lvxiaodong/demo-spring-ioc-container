package annotation.S06.user;

import annotation.S06.b.B;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.stereotype.Component;

@Component
public abstract class User {

    @Lookup
    public abstract B getB();

}
