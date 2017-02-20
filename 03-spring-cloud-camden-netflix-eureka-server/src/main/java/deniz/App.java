package deniz;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Created by Coşkun on 19.2.2017.
 */
@SpringBootApplication
@EnableEurekaServer
public class App {

  public static void main(String[] args) {
    new SpringApplicationBuilder(App.class).web(true).run(args);
  }

}
