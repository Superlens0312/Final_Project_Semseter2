import java.util.ArrayList;
import java.util.List;

public class TeamTournament extends Tournament implements Playable {
    private List<List<Player>> teams;

    public TeamTournament(String name) {
        super(name);
        this.teams = new ArrayList<>();
    }

    /**
     * Registers a player
     * @param team the player being registered
     */
    public void registerTeam(List<Player> team) {
        if (team != null) {
            teams.add(team);
        } else {
            System.out.println("Null team not registered.");
        }
    }

    /**
     * Plays a match between two players
     * @param p1 The first player
     * @param p2 The second player
     */
    @Override
    public void playMatch(Player p1, Player p2) {
        if (p1 != null) p1.addScore(10);
        if (p2 != null) p2.addScore(0);

        if (p1 != null) {
            p1.addScore(5);
        } else {
            System.out.println("Player 1 is null, skipping bonus points.");
        }

        if (p2 != null) {
            p2.addScore(5);
        } else {
            System.out.println("Player 2 is null, skipping bonus points.");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Team Tournament: " + name + "| Teams: " + teams.size());
    }

    public List<List<Player>> getTeams() {
        return teams;
    }
}
