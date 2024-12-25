package com.azuredemo.azuredemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureController {

    @GetMapping("/azure")
    public String hello() {
        return "Hello  Azure  World";
    }
}