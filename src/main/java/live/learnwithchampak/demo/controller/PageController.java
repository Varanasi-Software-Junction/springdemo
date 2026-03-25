package live.learnwithchampak.demo.controller;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class PageController {
 @GetMapping("/about")
    public String about(@RequestParam(defaultValue = "Champak") String name,Model model) {
        model.addAttribute("name",name);
        return "about";
    }
    @GetMapping("/me")
    public String home(Model model) {
           model.addAttribute("name", "Champak");
        return "index";
    }
}