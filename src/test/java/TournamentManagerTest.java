import org.junit.jupiter.api.Test;

public class TournamentManagerTest {
    @Test
    void testAddUser() {
        TournamentManager manager = new TournamentManager();
        Player player = new Player("TestPlayer", 0001,0);
        manager.addUser(player);
        // TODO: Check if user added
    }

    @Test
    void testAddTournament() {
        TournamentManager manager = new TournamentManager();
        SoloTournament tournament = new SoloTournament("Solo Battle");
        manager.addTournament(tournament);
        // TODO: Check if tournament added
    }
}
