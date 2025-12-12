package com.springboot.project.lovable_clone.service;

import com.springboot.project.lovable_clone.dto.UserProfileResponse;
import com.springboot.project.lovable_clone.dto.subscription.CheckoutRequest;
import com.springboot.project.lovable_clone.dto.subscription.CheckoutResponse;
import com.springboot.project.lovable_clone.dto.subscription.PortalResponse;
import com.springboot.project.lovable_clone.dto.subscription.SubscriptionResponse;
import org.jspecify.annotations.Nullable;

public interface SubscriptionService {
    UserProfileResponse getProfile(Long userId);

    SubscriptionResponse getCurrentSubscription(Long userId);

    PortalResponse openCustomerPortal(Long userId);

    CheckoutResponse createCheckoutSessionUrl(CheckoutRequest request, Long userId);
}
