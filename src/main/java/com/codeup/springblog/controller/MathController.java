package com.codeup.springblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.PrintWriter;

@Controller
class MathController {

    @GetMapping("/test")
    @ResponseBody
    public String test(){
        return "<h1>This is just a test</h2>";
    }

    @RequestMapping(path = "/add/{number1}/and/{number2}", method = RequestMethod.GET)
    @ResponseBody
    public String addTest(@PathVariable int number1, @PathVariable int number2) {
        String total = String.valueOf(number1 + number2);
        return String.format("The number %d is added to %d and the total is %s", number1, number2, total);
    }

    @GetMapping("/subtract/{number1}/from/{number2}")
    @ResponseBody
    public int subtractTest(@PathVariable int number1, @PathVariable int number2) {
        return number1 - number2;
    }

    @GetMapping("/multiply/{number1}/and/{number2}")
    @ResponseBody
    public int multiplyTest(@PathVariable int number1, int number2) {
        return number1 * number2;
    }

    @GetMapping("/divide/{number1}/divide/{number2}")
    @ResponseBody
    public int divideTest(@PathVariable int number1, int number2) {
        return number1 + number2;
    }
}
