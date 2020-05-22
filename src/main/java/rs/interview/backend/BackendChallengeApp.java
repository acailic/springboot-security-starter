package rs.interview.backend;

import com.sun.org.slf4j.internal.Logger;
import com.sun.org.slf4j.internal.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;

import java.util.HashMap;
import java.util.Map;

/**
 * @author a.ilic
 */
@SpringBootApplication
@EnableConfigurationProperties
public class BackendChallengeApp {

    private static final Logger log = LoggerFactory.getLogger(BackendChallengeApp.class);
    private final Environment env;


    public BackendChallengeApp(Environment env) {
        this.env = env;
    }
    /**
     * Main method, used to run the application.
     *
     * @param args the command line arguments.
     */
    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(BackendChallengeApp.class);
        Map<String, Object> defProperties = new HashMap();
        defProperties.put("spring.profiles.default", "dev,swagger");
        app.setDefaultProperties(defProperties);
        app.run(args);
    }



}
