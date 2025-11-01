package com.sodforge.server.workspace.domain;

import com.sodforge.server.workspace.infrastructure.WorkspaceRepository;
import lombok.AllArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@AllArgsConstructor
public class WorkspaceService {

    private final WorkspaceRepository repository;

    private final ApplicationEventPublisher events;

    @Transactional
    public Workspace createWorkspace(String name, UUID createdBy) {
        Workspace workspace = new Workspace();
        workspace.setId(UUID.randomUUID());
        workspace.setName(name);
        workspace.setCreatedById(createdBy);
        repository.save(workspace);

        events.publishEvent(WorkspaceCreatedEvent.of(workspace));
        return workspace;
    }
}