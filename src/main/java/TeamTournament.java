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
        teams.add(team);
    }

    /**
     * Plays a match between two players
     * @param p1 The first player
     * @param p2 The second player
     */
    @Override
    public void playMatch(Player p1, Player p2) {
        //TODO: Implement match logic
    }

    @Override
    public void displayInfo() {
        System.out.println("Team Tournament: " + name + "| Teams: " + teams.size());
    }
}
