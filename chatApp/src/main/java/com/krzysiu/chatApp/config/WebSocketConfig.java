package com.krzysiu.chatApp.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

/*
    Configure websocket endpoint
 */


@Configuration
@EnableWebSocketMessageBroker // Enable websocket server
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    //configure WebSocketMessageBrokerConfigurer interface

    //Registration clients endpoint
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry){ //STOMP - simple text oriented messaging protocol
        registry.addEndpoint("/ws").withSockJS(); //SockJS is used to enable fallback options for browsers that don't support WebSockets
    }

    //message broker for routing massages from one client to another
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry){
        registry.setApplicationDestinationPrefixes("/app");
        registry.enableSimpleBroker("/topic");
    }
}
