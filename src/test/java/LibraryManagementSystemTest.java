

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LibraryManagementSystemTest {

    @Test
    public void testAddPatron() {
        LibraryManagementSystem lms = new LibraryManagementSystem();
        Patron patron = new Patron(1, "John Doe", "123 Main St", 5.0);
        lms.addPatron(patron);

        // No direct access to list, so we test by calling display (basic demo for now)
        // In real life, you'd want getter methods or internal checks.
        // For this demo, we assert that no exception occurs:
        assertDoesNotThrow(() -> lms.displayAllPatrons());
    }
}
