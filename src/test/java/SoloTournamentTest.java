import org.junit.jupiter.api.Test;

public class SoloTournamentTest {
    @Test
    void testRegisterPlayer() {
        SoloTournament tournament = new SoloTournament("Solo Cup");
        Player player = new Player("PlayerA", 0001,0);
        tournament.registerPlayer(player);
        // TODO: Check if player registered (after getter is created)
    }
}
