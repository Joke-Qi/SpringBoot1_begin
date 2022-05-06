package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;

@Controller
public class SpringBootController {

    @GetMapping("/h1")
    public String hello(Model model){
        model.addAttribute("msg","<h1>你好<h1>");
        model.addAttribute("users", Arrays.asList("Luqi","hanhan"));
        return "hello";
    }
}
