package com.springboot.project.lovable_clone.entities;

import java.time.Instant;

public class UsageLog {
    Long id;
    User user;
    Project project;
    String action;
    Integer tokenUsed;
    Integer durationMs;
    String metaData;
    Instant createdAt;
}
