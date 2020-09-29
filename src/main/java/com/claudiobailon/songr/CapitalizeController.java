package com.claudiobailon.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

@Controller
public class CapitalizeController {
    @GetMapping("/capitalize/{to}")
    public String capitalize(
            Model m,
            @PathVariable String to
    ){
//        capMe =capMe.toUpperCase();
        m.addAttribute("capMe", to.toUpperCase());
        return "capitalize";
    }
}
