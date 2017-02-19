package my.deniz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Coşkun on 19.2.2017.
 */
@SpringBootApplication
@EnableEurekaClient
@RestController
public class App {

    @RequestMapping("/")
    public String home() {
        return "Hello World";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
