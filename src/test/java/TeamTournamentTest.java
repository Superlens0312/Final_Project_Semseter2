import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class TeamTournamentTest {
    @Test
    void testRegisterTeam() {
        TeamTournament tournament = new TeamTournament("Team Cup");
        List<Player> team = Arrays.asList(
                new Player("Player1", 0001,0),
                new Player("Player2", 0002,0)
        );
        tournament.registerTeam(team);
        // TODO: Check if team registered (after getter is created)
    }
}
