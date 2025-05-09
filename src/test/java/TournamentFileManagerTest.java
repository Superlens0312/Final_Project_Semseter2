import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TournamentFileManagerTest {
    @Test
    public void testSaveAndLoadPlayers() {
        TournamentFileManager tfm = new TournamentFileManager();
        List<Player> players = new ArrayList<>();
        players.add(new Player("Alice", 01));
        players.get(0).addScore(15);
        tfm.savePlayers(players);

        List<Player> loaded = tfm.loadPlayers();
        assertFalse(loaded.isEmpty());
        assertEquals("Alice", loaded.get(0).getUsername());
        assertEquals(15, loaded.get(0).getScore());

        new File("player.txt").delete(); // cleanup
    }

    @Test
    public void testSaveTournaments() {
        TournamentFileManager tfm = new TournamentFileManager();
        List<Tournament> tournaments = new ArrayList<>();
        tournaments.add(new SoloTournament("Championship"));
        tfm.saveTournaments(tournaments);

        File file = new File("src/test/java/TournamentSave.csv");  // Match code path
        assertTrue(file.exists());
    }

    @Test
    public void testLoadPlayers_FromMissingFile() {
        File f = new File("src/test/java/Player.csv");
        f.delete(); // ensure it doesn't exist
        TournamentFileManager tfm = new TournamentFileManager();
        List<Player> loaded = tfm.loadPlayers();
        assertTrue(loaded.isEmpty());
    }

    @Test
    public void testLoadTournaments_Default() {
        TournamentFileManager tfm = new TournamentFileManager();
        List<Tournament> tournaments = tfm.loadTournaments();
        assertTrue(tournaments.isEmpty()); // placeholder logic
    }

    @Test
    public void testSaveNullPlayersList() {
        TournamentFileManager tfm = new TournamentFileManager();
        assertDoesNotThrow(() -> tfm.savePlayers(null));
    }

    @Test
    public void testSaveEmptyPlayersList() {
        TournamentFileManager tfm = new TournamentFileManager();
        assertDoesNotThrow(() -> tfm.savePlayers(new ArrayList<>()));
    }

    @Test
    public void testSaveNullTournamentsList() {
        TournamentFileManager tfm = new TournamentFileManager();
        assertDoesNotThrow(() -> tfm.saveTournaments(null));
    }

    @Test
    public void testSaveEmptyTournamentsList() {
        TournamentFileManager tfm = new TournamentFileManager();
        assertDoesNotThrow(() -> tfm.saveTournaments(new ArrayList<>()));
    }
}
