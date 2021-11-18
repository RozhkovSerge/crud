package edu.rozkov.crudApp.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {

    @GetMapping("/hello")
    public String getHello(@RequestParam(name = "name", required = false) String name) {
        System.out.printf("Hello, %s", name);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String getGoodbye() {
        return "first/goodbye";
    }

}
