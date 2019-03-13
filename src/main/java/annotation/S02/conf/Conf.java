package annotation.S02.conf;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration()
@Import({ConfA.class, ConfB.class, ConfBase.class})
public class Conf {
}
