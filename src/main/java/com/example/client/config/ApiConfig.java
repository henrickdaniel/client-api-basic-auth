package com.example.client.config;

import br.com.ApiClient;
import br.com.henrick.HelloControllerApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApiConfig {


    @Bean
    public HelloControllerApi helloControllerApi(){
        HelloControllerApi helloControllerApi = new HelloControllerApi();
        ApiClient apiClient = new ApiClient();
        apiClient.setUsername("user");
        apiClient.setPassword("user");
        helloControllerApi.setApiClient(apiClient);
        return helloControllerApi;
    }

}
