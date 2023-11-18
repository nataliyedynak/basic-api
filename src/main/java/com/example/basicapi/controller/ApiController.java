package com.example.basicapi.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public String getHelloMessage() {
        log.info("GET Request received for /api/hello");
        String message = "Hello, welcome to the Basic API!";
        log.info("Returning message: '{}'", message);
        return message;
    }

    @PostMapping("/echo")
    public String postEchoMessage(@RequestBody String input) {
        log.info("POST Request received for /api/echo with input: '{}'", input);
        String response = "You said: " + input;
        log.info("Returning echo response: '{}'", response);
        return response;
    }
}
