package com.springboot.project.lovable_clone.service;

import com.springboot.project.lovable_clone.dto.member.InviteMemberRequest;
import com.springboot.project.lovable_clone.dto.member.MemberResponse;
import com.springboot.project.lovable_clone.entities.ProjectMember;
import org.jspecify.annotations.Nullable;

import java.util.List;

public interface ProjectMemberService {
    List<ProjectMember> getProjectMembers(Long projectId, Long userId);

     MemberResponse inviteMember(Long projectId, InviteMemberRequest request, Long userId);
     MemberResponse updateMemberRole(Long projectId, Long memberId, Long userId);

   MemberResponse deleteMemberRole(Long projectId, Long memberId, Long userId);
}
