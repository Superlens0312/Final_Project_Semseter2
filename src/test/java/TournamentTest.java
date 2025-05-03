import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TournamentTest {
    @Test
    void testTournamentName() {
        SoloTournament tournament = new SoloTournament("E-Sports Open");
        assertEquals("E-Sports Open", tournament.getName());
    }
}
