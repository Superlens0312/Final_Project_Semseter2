import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlayerTest {
    @Test
    void testAddScore() {
        Player player = new Player("TestPlayer", 0001);
        player.addScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testAddScore_MultipleTimes() {
        Player p = new Player("multi", 0001);
        p.addScore(10);
        p.addScore(15);
        assertEquals(25, p.getScore());
    }

    @Test
    void testCompareTo() {
        Player p1 = new Player("TestPlayer1", 0001);
        Player p2 = new Player("TestPlayer2", 0002);
        p1.addScore(20);
        p2.addScore(10);
        assertTrue(p1.compareTo(p2) < 0); // because higher score first
    }

    @Test
    public void testCompareTo_EqualScores() {
        Player p1 = new Player("p1", 0001);
        Player p2 = new Player("p2", 0002);
        p1.addScore(20);
        p2.addScore(20);
        assertEquals(0, p1.compareTo(p2));
    }
    @Test
    public void testNullUsername() {
        Player p = new Player(null, 123);
        assertEquals("", p.getUsername());
    }

    @Test
    public void testNullId() {
        Player p = new Player("Tester", null);
        assertEquals(0, p.getId());
    }

    @Test
    public void testEmptyUsername() {
        Player p = new Player("", 123);
        assertEquals("", p.getUsername());
    }

    @Test
    public void testEmptyId() {
        Player p = new Player("Tester", 0);
        assertEquals(0, p.getId());
    }

    @Test
    public void testAddNegativeScore() {
        Player p = new Player("NegTester", 004);
        p.addScore(-5);  // Should reset to 0 if negative total (as per our fix)
        assertEquals(0, p.getScore());
    }
}
