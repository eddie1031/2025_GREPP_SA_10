package com.example.demo.services;

import lombok.RequiredArgsConstructor;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class AiService {

    private final ChatClient client;

    public AiService(ChatClient.Builder chatClientBuilder) {
        this.client = chatClientBuilder.build();
    }



}
