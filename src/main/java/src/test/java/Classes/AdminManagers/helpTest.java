package Classes.AdminManagers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class helpTest {

    @Test
    void summation() {
        var h = new help();
        // Correct usage of assertEquals
        assertEquals(7, h.summation(2, 5));  // Expected value, actual value
    }
}
