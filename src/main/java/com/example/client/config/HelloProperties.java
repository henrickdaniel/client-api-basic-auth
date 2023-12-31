package com.example.client.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ConfigurationProperties(prefix = "api.hello")
@PropertySource(value = "classpath:application.yaml")
@Data
public class HelloProperties {

    private String user;
    private String password;

}
