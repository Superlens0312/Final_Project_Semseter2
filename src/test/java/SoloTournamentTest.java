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
    public void testRegisterMultiplePlayers() {
        SoloTournament tournament = new SoloTournament("Solo Clash");
        tournament.registerPlayer(new Player("A", 0001,0));
        tournament.registerPlayer(new Player("B", 0002,0));
        assertEquals(2, tournament.getParticipants().size());
    }

    @Test
    public void testPlayMatch() {
        SoloTournament tournament = new SoloTournament("Solo Arena");
        Player p1 = new Player("One", 01,0);
        Player p2 = new Player("Two", 02,0);
        tournament.playMatch(p1, p2);
        assertTrue(p1.getScore() == 10 || p2.getScore() == 10);
    }

    @Test
    public void testPlayMatchScoreChange() {
        SoloTournament tournament = new SoloTournament("Solo Arena");
        Player p1 = new Player("One", 0001,0);
        Player p2 = new Player("Two", 0002,0);
        tournament.playMatch(p1, p2);
        int totalScore = p1.getScore() + p2.getScore();
        assertEquals(10, totalScore);
    }

    @Test
    public void testPlayMatchNoNegativeScore() {
        SoloTournament tournament = new SoloTournament("Safe Match");
        Player p1 = new Player("Safe1", 0001,0);
        Player p2 = new Player("Safe2", 0002,0);
        tournament.playMatch(p1, p2);
        assertTrue(p1.getScore() >= 0 && p2.getScore() >= 0);
    }
}
