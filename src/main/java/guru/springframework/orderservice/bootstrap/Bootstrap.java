package guru.springframework.orderservice.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Created by jt on 6/8/22.
 */
@Component
public class Bootstrap implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("I was called!");
    }
}
