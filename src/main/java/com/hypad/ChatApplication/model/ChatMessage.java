package com.hypad.ChatApplication.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ChatMessage {
    private String sender;
    private String content;
    private MessageType messageType;
}
