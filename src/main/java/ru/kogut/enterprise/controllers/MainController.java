package ru.kogut.enterprise.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/hello")
    public String sayHello(@RequestParam(name = "name", required = false,
            defaultValue = "unknown name") String name, Model model){
        model.addAttribute("name", name);
        return "helloPage";
    }
}
