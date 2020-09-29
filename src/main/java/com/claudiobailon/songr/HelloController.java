package com.claudiobailon.songr;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/hello")//get route
    public String sayHello() {
        return "hello";//sends to hello html
    }
}