package com.springboot.project.lovable_clone.entities;

import com.springboot.project.lovable_clone.enums.MessageRole;

import java.time.Instant;

public class ChatMessage {
    Long id;
    ChatSession chatSession;
    String content;
    MessageRole role;
    String toolCalls;
    Integer tokensUsed;
    Instant createdAt;
}
