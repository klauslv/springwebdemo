package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Classname HelloController
 * @Description TODO
 * @Date 2019/6/17
 * @Author by Chakid
 */


@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Hello SpringBoot";
    }
}
