package roo.nw;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

/**
 * = NorthwindApplication
 *
 * TODO Auto-generated class documentation
 *
 */
@SpringBootApplication
@EnableCaching
public class NorthwindApplication {

    /**
     * TODO Auto-generated method documentation
     *
     * @param args
     */
    public static void main(String[] args) {
        SpringApplication.run(NorthwindApplication.class, args);
    }
}
