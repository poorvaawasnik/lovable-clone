package com.springboot.project.lovable_clone.dto.member;

import com.springboot.project.lovable_clone.enums.ProjectRole;

public record UpdateMemberRoleRequest(
ProjectRole role
) {
}
