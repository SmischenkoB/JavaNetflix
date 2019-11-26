package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.env.YamlPropertySourceLoader;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.PropertySource;


@SpringBootApplication
@EnableEurekaServer
//@PropertySource("file:${D:\\Java_works\\NetflixOSSServer\\src\\main\\resources\\bootstrap.properties}")
public class EurekaServiceApplication {

    @Autowired
   private ControllerThing controllerThing;

    public static void main(String[] args) {

        SpringApplication.run(EurekaServiceApplication.class, args);

    }
}