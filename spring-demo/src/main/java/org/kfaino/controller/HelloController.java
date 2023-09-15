package org.kfaino.controller;

import org.kfaino.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    public HelloController() {
        System.out.println("HelloController......Constructor");
    }

    @Autowired
    private HelloService helloService;

    @RequestMapping("hello")
    public String sayHello() {
        String hello = helloService.sayHello("Hello SpringMvc!");
        return hello;
    }
}
