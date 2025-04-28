import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrganizerTest {
    @Test
    void testDisplayStats() {
        Organizer organizer = new Organizer("OrgUser", 0001);
        assertEquals("OrgUser", organizer.getUsername());
    }
}
