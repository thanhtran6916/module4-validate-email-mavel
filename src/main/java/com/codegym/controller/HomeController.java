package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class HomeController {
    private static String regexEmail = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";

    private Pattern pattern;

    private Matcher matcher;

    public HomeController() {
        pattern = Pattern.compile(regexEmail);
    }

    @GetMapping("/home")
    public String home() {
        return "index";
    }

    @PostMapping("/validate")
    public ModelAndView checkRegex(@RequestParam("email") String email) {
        ModelAndView modelAndView = new ModelAndView("/index");
        boolean isValidate = isValidate(email);
        if (isValidate) {
            modelAndView.addObject("message", "thanh cong");
        } else {
            modelAndView.addObject("message", "that bai");
        }
        return modelAndView;
    }

    public boolean isValidate(String email) {
        matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
