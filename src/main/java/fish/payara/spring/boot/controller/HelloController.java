package fish.payara.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Random;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Home Page \n";
    }
    
    @RequestMapping("/hello")
    public String hello() {
        return "Hello, World! \n";
    }
    
    @RequestMapping("/random")
    public String random() {
        Random rand = new Random();
        int  n = rand.nextInt(50) + 1;
        String str = Integer.toString(n);
        return str + "\n";
    }
}
