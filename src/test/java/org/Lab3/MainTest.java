package org.Lab3;
import org.Lab3.PermissionManager;

public class Main_test {

    PermissionManager permissionManager;

    @BeforeEach
    void setUp() {
        permissionManager = new PermissionManager();
    }

    @Test
    @DisplayName("Simple enum should work")
    void testGet() {
        assertEquals(20, calculator.get(4, 5),
                "Regular multiplication should work");
    }
}
