package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "CSCM");
        return "home";
    }

    @GetMapping("/abou")
    public String about() {
        return "abou";
    }

    @GetMapping("/service")
    public String services() {
        return "about";
    }
}
