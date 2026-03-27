package live.learnwithchampak.demo.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @PostMapping("/postmap")
    public String posttwa() {
        return "Post Wa";
    }

    @GetMapping("/getmap")
    public String getwa() {
        return "Get Wa";
    }

    @GetMapping("/")
    public String home() {
        return "Spring Starter  is running.";
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong";
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }
}
