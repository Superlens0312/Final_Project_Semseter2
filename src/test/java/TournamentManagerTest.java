import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TournamentManagerTest {
    @Test
    void testAddUser() {
        TournamentManager manager = new TournamentManager();
        Player player = new Player("TestPlayer", 0001,0);
        manager.addUser(player);
        assertEquals(1, manager.getUsers().size());
        assertEquals("TestPlayer", manager.getUsers().get(0).getUsername());
    }

    @Test
    void testAddTournament() {
        TournamentManager manager = new TournamentManager();
        SoloTournament tournament = new SoloTournament("Solo Battle");
        manager.addTournament(tournament);
        assertEquals(1, manager.getTournaments().size());
        assertEquals("Solo Battle", manager.getTournaments().get(0).name);
    }

    @Test
    public void testListTournaments() {
        TournamentManager manager = new TournamentManager();
        manager.addTournament(new SoloTournament("Battle Royal"));
        manager.listTournaments(); // Output only
    }
}
