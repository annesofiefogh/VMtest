package com.example.testcicd.controllers;

import com.example.testcicd.models.Hello;
import com.example.testcicd.repositories.HelloRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    private HelloRepository helloRepository;

    @GetMapping("/getMessage")
    public ResponseEntity<Hello> getMessage(){
        Hello message = new Hello("Hello from server");
        helloRepository.save(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
