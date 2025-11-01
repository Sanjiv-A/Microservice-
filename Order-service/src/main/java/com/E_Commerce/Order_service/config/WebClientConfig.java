    package com.E_Commerce.Order_service.config;

    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.web.reactive.function.client.WebClient;

    @Configuration
    public class WebClientConfig {

        @Bean //we can interact with one service to another service
        public WebClient.Builder webClientBuilder(){
            return  WebClient.builder();
        }

    }
