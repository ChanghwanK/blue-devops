package com.example.wassample.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RequestMapping("/api")
@RestController
public class PingController {
    @GetMapping("/ping")
    public HashMap<Object, Object> hello() {
        var result = new HashMap<>();
        result.put("result", "200");
        result.put("message", "pong");
        return result;
    }
}
