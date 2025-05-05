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
    public void testRegister_MultipleTeams() {
        TeamTournament tt = new TeamTournament("4v4 Cup");
        List<Player> team1 = Arrays.asList(new Player("A1", 0001,0), new Player("A2", 0002,0));
        List<Player> team2 = Arrays.asList(new Player("B1", 0003,0), new Player("B2", 0004,0));
        tt.registerTeam(team1);
        tt.registerTeam(team2);
        assertEquals(2, tt.getTeams().size());
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

    @Test
    public void testPlayMatch_PointsAdded() {
        TeamTournament tt = new TeamTournament("Battle");
        Player cap1 = new Player("Leader1", 0001,0);
        Player cap2 = new Player("Leader2", 0002,0);
        tt.playMatch(cap1, cap2);
        assertEquals(5, cap1.getScore());
        assertEquals(5, cap2.getScore());
    }
}
