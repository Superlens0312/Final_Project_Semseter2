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

    @Test
    public void testNullUsername() {
        String Username  = String.valueOf(null);
        Organizer organizer = new Organizer(Username, 0001);
        assertNull(organizer.getUsername());
    }

    @Test
    public void testNullId() {
        int id  = Integer.parseInt(null);
        Organizer organizer = new Organizer("Tester", id);
        assertNull(organizer.getId());
    }

    @Test
    public void testEmptyUsername() {
        Organizer organizer = new Organizer("", 0002);
        assertEquals("", organizer.getUsername());
    }

    @Test
    public void testEmptyId() {
        int id  = Integer.parseInt("");
        Organizer organizer = new Organizer("Tester", id);
        assertEquals("", organizer.getId());
    }
}
