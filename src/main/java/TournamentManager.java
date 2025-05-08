import java.util.ArrayList;
import java.util.List;

public class TournamentManager {
    private List<User> users;
    private List<Tournament> tournaments;

    public TournamentManager() {
        this.users = new ArrayList<>();
        this.tournaments = new ArrayList<>();
    }

    /**
     * Adds a user
     * @param user the user that will be added
     */
    public void addUser(User user) {
        if (user != null) {
            users.add(user);
        }
    }

    /**
     * Adds a tournament
     * @param tournament the tournament that will be added
     */
    public void addTournament(Tournament tournament) {
        if (tournament != null) {
            tournaments.add(tournament);
        }
    }

    /**
     * Lists all tournaments.
     */
    public void listTournaments() {
        for (Tournament t : tournaments) {
            t.displayInfo();
        }
    }

    public List<User> getUsers() {
        return users;
    }

    public List<Tournament> getTournaments() {
        return tournaments;
    }
}
