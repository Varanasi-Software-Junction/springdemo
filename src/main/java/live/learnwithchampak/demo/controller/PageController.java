package live.learnwithchampak.demo.controller;

import org.springframework.ui.Model;
import org.apache.catalina.connector.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class PageController {
    @GetMapping("/testing")
    public String testing(Model model) {
        model.addAttribute("pageTitle", "Thymeleaf Home");
        model.addAttribute("message", "This is my Message.");
        model.addAttribute("name", "Champak");
        model.addAttribute("topics", java.util.List.of("Spring", "Thymeleaf", "MVC"));
        return "test";
    }

    @GetMapping("/about")
    public String about(@RequestParam(defaultValue = "Champak") String name, Model model) {
        model.addAttribute("name", name);
        return "about";
    }

    @GetMapping("/me")
    public String home(Model model) {
        model.addAttribute("name", "Champak");
        return "index";
    }

    @RequestMapping(value = "/req", method = RequestMethod.GET)
    public String req(@RequestParam(defaultValue = "Jetha") String name, Model model) {
        System.out.println(name);
        model.addAttribute("name", name);
        return "req";
    }
}