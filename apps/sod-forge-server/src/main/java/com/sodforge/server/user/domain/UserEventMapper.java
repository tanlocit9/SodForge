package com.sodforge.server.user.domain;

import com.sodforge.server.common.event.user.UserCreatedEvent;

import java.time.Instant;

public class UserEventMapper {
    public static UserCreatedEvent toUserCreatedEvent(User user) {
        return new UserCreatedEvent(
                user.getId(),
                user.getEmail(),
                user.getDisplayName(),
                Instant.now()
        );
    }
}
