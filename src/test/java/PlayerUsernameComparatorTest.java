import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerUsernameComparatorTest {
    @Test
    public void testComparatorSort() {
        Player p1 = new Player("Zelda", 0001,0);
        Player p2 = new Player("Anna", 0002,0);
        Player p3 = new Player("Bob", 0003,0);

        List<Player> players = Arrays.asList(p1, p2, p3);
        Collections.sort(players);

        assertEquals("Anna", players.get(0).getUsername());
        assertEquals("Bob", players.get(1).getUsername());
        assertEquals("Zelda", players.get(2).getUsername());
    }

    @Test
    public void testComparatorEqualNames() {
        Player p1 = new Player("Sam", 0001,0);
        Player p2 = new Player("Sam", 0002,0);

        PlayerUsernameComparator comparator = new PlayerUsernameComparator();
        assertEquals(0, comparator.compare(p1, p2));
    }

    @Test
    public void testComparatorCaseInsensitive() {
        Player p1 = new Player("alpha", 0001,0);
        Player p2 = new Player("Alpha", 0002,0);

        PlayerUsernameComparator comparator = new PlayerUsernameComparator();
        assertEquals(0, comparator.compare(p1, p2));
    }
}
