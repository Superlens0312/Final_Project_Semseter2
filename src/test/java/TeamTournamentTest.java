import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TeamTournamentTest {
    @Test
    void testRegisterTeam() {
        TeamTournament tournament = new TeamTournament("Team Cup");
        List<Player> team = Arrays.asList(
                new Player("Player1", 0001,0),
                new Player("Player2", 0002,0)
        );
        tournament.registerTeam(team);
        assertEquals(1, tournament.getTeams().size());
        assertEquals(2, tournament.getTeams().get(0).size());
    }

    @Test
    public void testPlayMatch() {
        TeamTournament tt = new TeamTournament("Tag Team");
        Player leader1 = new Player("Team1Leader", 01,0);
        Player leader2 = new Player("Team2Leader", 02,0);
        tt.playMatch(leader1, leader2);
        assertEquals(5, leader1.getScore());
        assertEquals(5, leader2.getScore());
    }
}
