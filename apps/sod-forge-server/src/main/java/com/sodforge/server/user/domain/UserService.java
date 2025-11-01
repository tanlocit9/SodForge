package com.sodforge.server.user.domain;

import com.sodforge.server.user.infrastructure.UserRepository;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
public class UserService {

    private final UserRepository repository;

    private final ApplicationEventPublisher events;

    public UserService(UserRepository repository, ApplicationEventPublisher events) {
        this.repository = repository;
        this.events = events;
    }

    @Transactional
    public void createUser(String email, String displayName) {
        User user = new User();
        user.setId(UUID.randomUUID());
        user.setEmail(email);
        user.setDisplayName(displayName);
        repository.save(user);

        events.publishEvent(UserEventMapper.toUserCreatedEvent(user));
    }
}