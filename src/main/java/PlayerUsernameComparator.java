import java.util.Comparator;

public class PlayerUsernameComparator implements Comparator<Player> {


    @Override
    public int compare(Player p1, Player p2) {
        return p1.getUsername().toLowerCase().compareTo(p2.getUsername().toLowerCase());
    }
}
