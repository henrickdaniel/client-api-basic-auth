package com.example.client.config;

import br.com.ApiClient;
import br.com.henrick.HelloControllerApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {

    @Autowired
    HelloProperties helloProperties;

    @Bean
    public HelloControllerApi helloControllerApi(){
        HelloControllerApi helloControllerApi = new HelloControllerApi();
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername(helloProperties.getUser());
        apiClient.setPassword(helloProperties.getPassword());
        helloControllerApi.setApiClient(apiClient);
        return helloControllerApi;
    }

}
