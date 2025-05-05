import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {
    @Test
    void testAddScore() {
        Player player = new Player("TestPlayer", 0001,0);
        player.addScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    public void testAddScoreMultipleTimes() {
        Player p = new Player("multi", 0001,0);
        p.addScore(10);
        p.addScore(15);
        assertEquals(25, p.getScore());
    }

    @Test
    void testCompareTo() {
        Player p1 = new Player("TestPlayer1", 0001,0);
        Player p2 = new Player("TestPlayer2", 0002,0);
        p1.addScore(20);
        p2.addScore(10);
        assertTrue(p1.compareTo(p2) < 0); // because higher score first
    }

    @Test
    public void testCompareToEqualScores() {
        Player p1 = new Player("p1", 0001,0);
        Player p2 = new Player("p2", 0002,0);
        p1.addScore(20);
        p2.addScore(20);
        assertEquals(0, p1.compareTo(p2));
    }
}
