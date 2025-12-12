package com.springboot.project.lovable_clone.dto.subscription;

public record PlanResponse(

        Long id,
        String name,
        String stringPriceId,
        Integer maxProjects,
        Integer maxTokensPerDay,
        Boolean unlimitedAi,
        Boolean price
) {
}
