package org.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/")
    public String test() {
        return "index.html";
    }
}
