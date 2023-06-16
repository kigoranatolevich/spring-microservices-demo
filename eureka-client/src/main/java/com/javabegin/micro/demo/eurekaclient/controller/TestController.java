package com.javabegin.micro.demo.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.*;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
