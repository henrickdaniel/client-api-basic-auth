package com.example.client;


import br.com.ApiClient;
import br.com.henrick.HelloControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {

    @Autowired
    HelloControllerApi helloControllerApi;

    public String sayHello(){
        return helloControllerApi.hello().getMessage();
    }

}
