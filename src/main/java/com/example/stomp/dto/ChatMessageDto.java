package com.example.stomp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Getter
@Setter
@ToString
public class ChatMessageDto {
    private String content;
    private String sender;

    public ChatMessageDto(String content, String sender){
        this.content = content;
        this.sender = sender;
    }
}
