import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerTest {
    @Test
    void testAddScore() {
        Player player = new Player("TestPlayer", 0,0);
        player.addScore(10);
        assertEquals(10, player.getScore());
    }

    @Test
    void testCompareTo() {
        Player p1 = new Player("TestPlayer1", 0001,0);
        Player p2 = new Player("TestPlayer2", 0002,0);
        p1.addScore(20);
        p2.addScore(10);
        assertTrue(p1.compareTo(p2) < 0); // because higher score first
    }
}
