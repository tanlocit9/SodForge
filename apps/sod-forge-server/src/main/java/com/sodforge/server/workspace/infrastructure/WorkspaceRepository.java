package com.sodforge.server.workspace.infrastructure;

import com.sodforge.server.workspace.domain.Workspace;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface WorkspaceRepository extends ListCrudRepository<Workspace, UUID> {
}
