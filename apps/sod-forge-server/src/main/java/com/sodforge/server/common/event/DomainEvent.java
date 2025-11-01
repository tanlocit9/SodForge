package com.sodforge.server.common.event;

import java.time.Instant;
import java.util.UUID;

public interface DomainEvent {
    UUID id();

    Instant occurredAt();
}
