package com.springsafe.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping
    public String getDemo(){

        return ("<h1> Spring security demo success</h1>");
    }

    @RequestMapping("/error")
    public String handleError() {
        // Handle error logic here
        return "error";
}}
