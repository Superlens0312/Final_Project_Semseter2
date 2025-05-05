import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TournamentFileManagerTest {
    @Test
    public void testSaveAndLoadPlayers() {
        TournamnetFileManager tfm = new TournamnetFileManager();
        List<Player> players = new ArrayList<>();
        players.add(new Player("Alice", 01,0));
        players.get(0).addScore(15);
        tfm.savePlayers(players);

        List<Player> loaded = tfm.loadPlayers();
        assertFalse(loaded.isEmpty());
        assertEquals("Alice", loaded.get(0).getUsername());
        assertEquals(15, loaded.get(0).getScore());

        new File("players.txt").delete(); // cleanup
    }

    @Test
    public void testSaveTournaments() {
        TournamnetFileManager tfm = new TournamnetFileManager();
        List<Tournament> tournaments = new ArrayList<>();
        tournaments.add(new SoloTournament("Championship"));
        tfm.saveTournaments(tournaments);

        File file = new File("tournaments.txt");
        assertTrue(file.exists());
        file.delete(); // cleanup
    }
    @Test
    public void testLoadPlayersFromMissingFile() {
        File f = new File("players.txt");
        f.delete(); // ensure it doesn't exist
        TournamnetFileManager tfm = new TournamnetFileManager();
        List<Player> loaded = tfm.loadPlayers();
        assertTrue(loaded.isEmpty());
    }

    @Test
    public void testLoadTournamentsDefault() {
        TournamnetFileManager tfm = new TournamnetFileManager();
        List<Tournament> tournaments = tfm.loadTournaments();
        assertTrue(tournaments.isEmpty()); // placeholder logic
    }
}
