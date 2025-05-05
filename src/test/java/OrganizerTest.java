import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OrganizerTest {
    @Test
    void testDisplayStats() {
        Organizer organizer = new Organizer("OrgUser", 0001);
        assertEquals("OrgUser", organizer.getUsername());
    }

    @Test
    public void testGetUsernameAndId() {
        Organizer organizer = new Organizer("orgUser", 0001);
        int expexted = 0001;
        assertEquals("orgUser", organizer.getUsername());
        assertEquals(expexted, organizer.getId());
    }

    @Test
    public void testDisplayStats_RunsWithoutError() {
        Organizer organizer = new Organizer("Marie", 0007);
        assertDoesNotThrow(organizer::displaystats);
    }

    @Test
    public void testDifferentOrganizersHaveUniqueIDs() {
        Organizer o1 = new Organizer("Alice", 0001);
        Organizer o2 = new Organizer("Bob", 0002);
        assertNotEquals(o1.getId(), o2.getId());
    }
}
