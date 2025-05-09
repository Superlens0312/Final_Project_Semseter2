import java.util.ArrayList;
import java.util.List;

public class SoloTournament extends Tournament implements Playable {
    private List<Player> participants;

    public SoloTournament(String name) {
        super(name);
        this.participants = new ArrayList<>();
    }

    /**
     * Registers a player
     * @param player the player being registered
     */
    public void registerPlayer(Player player) {
        if (player != null) {
            participants.add(player);
        } else {
            System.out.println("Null player not registered.");
        }

    }

    /**
     * Players a match between two players
     * @param p1 The first player
     * @param p2 The second player
     */
    @Override
    public void playMatch(Player p1, Player p2) {
        if (p1 != null) p1.addScore(5);
        if (p2 != null) p2.addScore(5);

        int winner = (int) (Math.random() * 2);
        if (winner == 0) {
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
    }

    @Override
    public void displayInfo() {
        System.out.println("Solo Tournament: " + name + "| Participants: " + participants.size());
    }

    public List<Player> getParticipants() {
        return participants;
    }
}
