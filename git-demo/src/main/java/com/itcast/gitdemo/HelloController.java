package com.itcast.gitdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("info")
    public String info(){
        return "Hello Springboot info 11111111111111";
    }
}
