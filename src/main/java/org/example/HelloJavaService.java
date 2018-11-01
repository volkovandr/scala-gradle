package org.example;

import org.springframework.stereotype.Service;

@Service
public class HelloJavaService {

    private HelloJava helloJava;

    public HelloJavaService() {
        helloJava = new HelloJava();
    }

    public String helloMessage() {
        return helloJava.sayHello();
    }
}
