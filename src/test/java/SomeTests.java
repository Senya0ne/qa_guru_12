import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SomeTests {
        @Test
        void testSuccess() {
            assertTrue(true);
        }

        @Test
        void testFailed() {
            assertTrue(false);
        }

        @Test
        @Disabled
        void testFailedDisabled() {
            assertTrue(false);
        }
}
