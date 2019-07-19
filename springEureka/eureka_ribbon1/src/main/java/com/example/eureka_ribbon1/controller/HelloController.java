package com.example.eureka_ribbon1.controller;


import com.example.eureka_ribbon1.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private HelloService helloService;

    @RequestMapping("/hi")
    public String hiService(@RequestParam String  name){
        return helloService.hiService(name);
    }
}
