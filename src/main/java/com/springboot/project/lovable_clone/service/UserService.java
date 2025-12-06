package com.springboot.project.lovable_clone.service;

import com.springboot.project.lovable_clone.dto.UserProfileResponse;

public interface UserService {
UserProfileResponse getProfile(Long userId);
}
