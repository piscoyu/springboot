package com.example.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class TestController {

    @PostMapping("/test")
    public String test(){
        return "tvd -------";
    }
    @RequestMapping("/ftl")
    public ModelAndView ftl(){

        return new ModelAndView("index");
    }
}
