package com.springboot.project.lovable_clone.dto;

public record SignupRequest(
 String email,
 String name,
 String password
) {
}
