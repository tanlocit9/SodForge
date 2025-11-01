package com.sodforge.server.workspace.listener;

import com.sodforge.server.common.event.user.UserCreatedEvent;
import org.springframework.modulith.events.ApplicationModuleListener;
import org.springframework.stereotype.Component;

@Component
public class UserEventListener {

    @ApplicationModuleListener
    void on(UserCreatedEvent event) {
        System.out.printf("📥 Workspace module received UserCreatedEvent for %s%n", event.email());
        // e.g., auto-create a default workspace or log it
    }
}