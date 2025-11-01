package com.sodforge.server;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.modulith.core.ApplicationModule;
import org.springframework.modulith.core.ApplicationModules;

@SpringBootTest
class SodForgeApplicationTests {

    @Test
    void listAllModules() {
        ApplicationModules modules = ApplicationModules.of(SodForgeApplication.class);

        System.out.println("🧩 Current Modules:");
        modules.stream()
                .map(ApplicationModule::getDisplayName)
                .sorted()
                .forEach(name -> System.out.println("  - " + name));
    }

    @Test
    void verifyModuleDependencies() {
        ApplicationModules modules = ApplicationModules.of(SodForgeApplication.class);
        modules.verify(); // 🔥 Fails test if any module violates dependency rules
    }

}
