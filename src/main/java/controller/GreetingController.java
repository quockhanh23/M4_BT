package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {
    @GetMapping("")
    public String greeting() {
        return "index";
    }
    @GetMapping("/alo")
    public String alo(Model model) {
        model.addAttribute("name", "khánh");
        return "alo";
    }
    @GetMapping("/total")
    public String total(Model model,@RequestParam int a,@RequestParam int b) {
        int re = a + b;
        model.addAttribute("sum", re);
        return "total";
    }
    @PostMapping("/total")
    public String total1(Model model,@RequestParam int a,@RequestParam int b) {
        int re = a + b;
        model.addAttribute("sum", re);
        return "total";
    }
    @PostMapping("/change")
    public String MoneyChange(Model model,@RequestParam double a) {
        double res = a * 23000;
        model.addAttribute("dola", res);
        return "change";
    }


}