import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SoloTournamentTest {
    @Test
    void testRegisterPlayer() {
        SoloTournament tournament = new SoloTournament("Solo Cup");
        Player player = new Player("PlayerA", 0001);
        tournament.registerPlayer(player);

        assertEquals(1, tournament.getParticipants().size());
        assertEquals("PlayerA", tournament.getParticipants().get(0).getUsername());
    }

    @Test
    public void testRegister_MultiplePlayers() {
        SoloTournament tournament = new SoloTournament("Solo Clash");
        tournament.registerPlayer(new Player("A", 0001));
        tournament.registerPlayer(new Player("B", 0002));
        assertEquals(2, tournament.getParticipants().size());
    }

    @Test
    public void testPlayMatch() {
        SoloTournament tournament = new SoloTournament("Solo Arena");
        Player p1 = new Player("One", 01);
        Player p2 = new Player("Two", 02);
        tournament.playMatch(p1, p2);
        assertTrue(p1.getScore() == 15 || p2.getScore() == 5);
    }

    @Test
    public void testPlayMatch_ScoreChange() {
        SoloTournament tournament = new SoloTournament("Solo Arena");
        Player p1 = new Player("One", 0001);
        Player p2 = new Player("Two", 0002);
        tournament.playMatch(p1, p2);
        int totalScore = p1.getScore() + p2.getScore();
        assertEquals(20, totalScore);
    }

    @Test
    public void testPlayMatch_NoNegativeScore() {
        SoloTournament tournament = new SoloTournament("Safe Match");
        Player p1 = new Player("Safe1", 0001);
        Player p2 = new Player("Safe2", 0002);
        tournament.playMatch(p1, p2);
        assertTrue(p1.getScore() >= 0 && p2.getScore() >= 0);
    }

    @Test
    public void testRegisterNullPlayer() {
        SoloTournament tournament = new SoloTournament("Null Test");
        tournament.registerPlayer(null);
        assertEquals(0, tournament.getParticipants().size());  // Null players are not added
    }

    @Test
    public void testPlayMatchWithNullPlayers() {
        SoloTournament tournament = new SoloTournament("Null Match");
        assertDoesNotThrow(() -> tournament.playMatch(null, null));
    }
}
