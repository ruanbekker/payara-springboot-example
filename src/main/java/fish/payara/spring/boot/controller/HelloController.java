package fish.payara.spring.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
    
    @RequestMapping("/test")
    public String test() {
        return "Testing \n";
    }
}
