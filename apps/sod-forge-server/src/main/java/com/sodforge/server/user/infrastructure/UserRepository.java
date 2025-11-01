package com.sodforge.server.user.infrastructure;

import com.sodforge.server.user.domain.User;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends ListCrudRepository<User, UUID> {
}
