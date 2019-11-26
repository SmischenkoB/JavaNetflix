package hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("file:${D:\\Java_works\\NetflixOSSServer\\src\\main\\resources\\bootstrap.properties}")
public class ControllerThing {
    @Value("${something}")
    private String test;

    @RequestMapping("/some")
    public String GetValue(){return test;}
}
