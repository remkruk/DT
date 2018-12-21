package com.remkruk.dt.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {

    @GetMapping("/response")
    public String getResponse() {
        return "{\"response\":\"Nice response\"}";
    }
}
