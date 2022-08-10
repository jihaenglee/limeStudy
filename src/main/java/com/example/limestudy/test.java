package com.example.limestudy;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class test {

    @GetMapping("/login/login")
    public String helloWord(){

        System.out.println("hello");

        return "hello!";
    }
}
