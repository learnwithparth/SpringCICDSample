package in.learnwithparth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCicdSampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCicdSampleApplication.class, args);
    }

    @GetMapping("/index")
    public String displayIndex(){
        return "<h1> Hello from Index!!! </h1>";
    }
}
