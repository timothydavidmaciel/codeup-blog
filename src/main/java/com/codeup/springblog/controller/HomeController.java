package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
class HomeController {

    @GetMapping("/")
    @ResponseBody
    public String hello(){return "This is the landing page!";}
}
