package com.sodforge.server.user;

import com.sodforge.server.user.domain.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class UserEventTests {

    @Autowired
    UserService userService;

    @Test
    void userCreatedEventShouldTriggerWorkspaceListener() {
        userService.createUser("alice@sodforge.com", "Alice");
    }
}
