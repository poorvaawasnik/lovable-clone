package com.springboot.project.lovable_clone.service;

import com.springboot.project.lovable_clone.dto.subscription.PlanLimitResponse;
import com.springboot.project.lovable_clone.dto.subscription.UsageTodayResponse;
import org.jspecify.annotations.Nullable;

public interface UsageService {

    UsageTodayResponse getTodayUsage(Long userId);

    PlanLimitResponse getCurrentSubscriptionLimitsOfUser(Long userId);
}
