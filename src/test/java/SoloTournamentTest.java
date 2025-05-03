import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SoloTournamentTest {
    @Test
    void testRegisterPlayer() {
        SoloTournament tournament = new SoloTournament("Solo Cup");
        Player player = new Player("PlayerA", 0001,0);
        tournament.registerPlayer(player);

        assertEquals(1, tournament.getParticipants().size());
        assertEquals("PlayerA", tournament.getParticipants().get(0).getUsername());
    }

    @Test
    public void testPlayMatch() {
        SoloTournament tournament = new SoloTournament("Solo Arena");
        Player p1 = new Player("One", 01,0);
        Player p2 = new Player("Two", 02,0);
        tournament.playMatch(p1, p2);
        assertTrue(p1.getScore() == 10 || p2.getScore() == 10);
    }
}
