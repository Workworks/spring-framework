package org.kfaino.service;


import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloService() {
        System.out.println("HelloService......Constructor");
    }

    public String sayHello(String name){
        return name;
    }
}
