package com.ljh.hw.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {

    @GetMapping("/index")
    public String index() {
        System.out.println("index");
        return "index.html";

    }
}
