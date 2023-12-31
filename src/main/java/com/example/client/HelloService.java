package com.example.client;


import br.com.ApiClient;
import br.com.henrick.HelloControllerApi;
import com.example.client.config.HelloProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class HelloService {

    @Autowired
    HelloControllerApi helloControllerApi;

    public String sayHello(){
        return helloControllerApi.hello().getMessage();
    }

}
