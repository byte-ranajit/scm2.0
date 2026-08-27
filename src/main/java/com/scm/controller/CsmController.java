package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CsmController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "CSCM");
        return "home";
    }
}
