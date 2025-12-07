package com.springboot.project.lovable_clone.service;

import com.springboot.project.lovable_clone.dto.UserProfileResponse;

public interface SubscriptionService {
    UserProfileResponse getProfile(Long userId);
}
