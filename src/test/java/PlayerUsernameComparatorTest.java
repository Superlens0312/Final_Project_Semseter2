import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PlayerUsernameComparatorTest {
    @Test
    public void testComparatorSort() {
        Player p1 = new Player("Naruto", 0001);
        Player p2 = new Player("Friren", 0002);
        Player p3 = new Player("Thorfin", 0003);

        List<Player> players = Arrays.asList(p1, p2, p3);
        Collections.sort(players, new PlayerUsernameComparator());

        assertEquals("Friren", players.get(0).getUsername());
        assertEquals("Naruto", players.get(1).getUsername());
        assertEquals("Thorfin", players.get(2).getUsername());
    }

    @Test
    public void testComparator_EqualNames() {
        Player p1 = new Player("Sam", 0001);
        Player p2 = new Player("Sam", 0002);

        PlayerUsernameComparator comparator = new PlayerUsernameComparator();
        assertEquals(0, comparator.compare(p1, p2));
    }

    @Test
    public void testComparator_CaseInsensitive() {
        Player p1 = new Player("alpha", 0001);
        Player p2 = new Player("Alpha", 0002);

        PlayerUsernameComparator comparator = new PlayerUsernameComparator();
        assertEquals(0, comparator.compare(p1, p2));
    }

    @Test
    public void testComparatorWithNullUsernames() {
        Player p1 = new Player(null, 0001);
        Player p2 = new Player(null, 0002);

        PlayerUsernameComparator comparator = new PlayerUsernameComparator();
        assertEquals(0, comparator.compare(p1, p2));
    }

    @Test
    public void testComparatorWithOneNullUsername() {
        Player p1 = new Player(null, 0001);
        Player p2 = new Player("Beta", 0002);

        PlayerUsernameComparator comparator = new PlayerUsernameComparator();
        assertTrue(comparator.compare(p1, p2) < 0 || comparator.compare(p2, p1) > 0);
    }
}
