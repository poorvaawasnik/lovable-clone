package com.springboot.project.lovable_clone.service;

import com.springboot.project.lovable_clone.dto.AuthResponse;
import com.springboot.project.lovable_clone.dto.LoginRequest;
import com.springboot.project.lovable_clone.dto.SignupRequest;
import org.jspecify.annotations.Nullable;

public interface AuthService {

    AuthResponse signup(SignupRequest request);
    AuthResponse login(LoginRequest request);
}
