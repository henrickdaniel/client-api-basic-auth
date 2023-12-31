package com.example.client.controller;

import com.example.client.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

    @Autowired
    HelloService helloService;

    @GetMapping("/teste")
    public ResponseEntity teste(){
        return ResponseEntity.status(HttpStatus.OK).body(helloService.sayHello());
    }

}
