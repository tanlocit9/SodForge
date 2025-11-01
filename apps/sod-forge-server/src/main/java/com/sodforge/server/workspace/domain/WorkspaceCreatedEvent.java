package com.sodforge.server.workspace.domain;

import com.sodforge.server.common.event.DomainEvent;

import java.time.Instant;
import java.util.UUID;

public record WorkspaceCreatedEvent(
        UUID id,
        String name,
        UUID createdBy,
        Instant occurredAt
) implements DomainEvent {
    public static WorkspaceCreatedEvent of(Workspace workspace) {
        return new WorkspaceCreatedEvent(
                workspace.getId(),
                workspace.getName(),
                workspace.getCreatedById(),
                Instant.now()
        );
    }
}