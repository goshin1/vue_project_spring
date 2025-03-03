package com.example.stomp.controller;

import com.example.stomp.dto.ChatMessageDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {
    private final SimpMessagingTemplate template;

    @Autowired
    public ChatController(SimpMessagingTemplate template){
        this.template = template;
    }

    @MessageMapping("/messages")
    public ChatMessageDto send2(@RequestBody ChatMessageDto chatMessageDto){
//        System.out.println(chatMessageDto.toString());
        template.convertAndSend("/sub/message", chatMessageDto);
        return chatMessageDto;
    }


}
