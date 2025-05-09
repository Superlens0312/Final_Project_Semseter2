import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TeamTournamentTest {
    @Test
    void testRegisterTeam() {
        TeamTournament tournament = new TeamTournament("Team Cup");
        List<Player> team = Arrays.asList(
                new Player("Player1", 0001),
                new Player("Player2", 0002)
        );
        tournament.registerTeam(team);
        assertEquals(1, tournament.getTeams().size());
        assertEquals(2, tournament.getTeams().get(0).size());
    }

    @Test
    public void testRegister_MultipleTeams() {
        TeamTournament tt = new TeamTournament("4v4 Cup");
        List<Player> team1 = Arrays.asList(new Player("A1", 0001), new Player("A2", 0002));
        List<Player> team2 = Arrays.asList(new Player("B1", 0003), new Player("B2", 0004));
        tt.registerTeam(team1);
        tt.registerTeam(team2);
        assertEquals(2, tt.getTeams().size());
    }

    @Test
    public void testPlayMatch() {
        TeamTournament tt = new TeamTournament("Tag Team");
        Player leader1 = new Player("Team1Leader", 01);
        Player leader2 = new Player("Team2Leader", 02);
        tt.playMatch(leader1, leader2);
        assertEquals(15, leader1.getScore());
        assertEquals(5, leader2.getScore());
    }

    @Test
    public void testPlayMatch_PointsAdded() {
        TeamTournament tt = new TeamTournament("Battle");
        Player cap1 = new Player("Leader1", 0001);
        Player cap2 = new Player("Leader2", 0002);
        tt.playMatch(cap1, cap2);
        assertEquals(15, cap1.getScore());
        assertEquals(5, cap2.getScore());
    }

    @Test
    public void testRegisterNullTeam() {
        TeamTournament tt = new TeamTournament("Null Team");
        tt.registerTeam(null);
        assertEquals(0, tt.getTeams().size());  // Null teams are no longer added
    }

    @Test
    public void testRegisterEmptyTeam() {
        TeamTournament tt = new TeamTournament("Empty Team");
        tt.registerTeam(Arrays.asList());
        assertEquals(1, tt.getTeams().size());
        assertTrue(tt.getTeams().get(0).isEmpty());
    }

    @Test
    public void testPlayMatchWithNullPlayers() {
        TeamTournament tt = new TeamTournament("Null Match");
        assertDoesNotThrow(() -> tt.playMatch(null, null));
    }
}
