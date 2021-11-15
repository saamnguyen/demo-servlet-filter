package com.example.demoserveletfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class DemoServeletFilterApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoServeletFilterApplication.class, args);
    }

    @GetMapping("/")
    public String sayHello(){
        return "Hello Spring";
    }
}
