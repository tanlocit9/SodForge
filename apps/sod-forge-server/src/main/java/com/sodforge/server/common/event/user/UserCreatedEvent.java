package com.sodforge.server.common.event.user;

import com.sodforge.server.common.event.DomainEvent;

import java.time.Instant;
import java.util.UUID;

public record UserCreatedEvent(
        UUID id,
        String email,
        String displayName,
        Instant occurredAt
) implements DomainEvent {
}