package live.learnwithchampak.demo.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
}