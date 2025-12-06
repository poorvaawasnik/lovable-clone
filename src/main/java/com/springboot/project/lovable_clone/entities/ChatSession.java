package com.springboot.project.lovable_clone.entities;

import java.time.Instant;

public class ChatSession {
    Project project;
    User user;
    String title;
    Instant createdAt;
    Instant updatedAt;
    Instant deletedAt;
}
