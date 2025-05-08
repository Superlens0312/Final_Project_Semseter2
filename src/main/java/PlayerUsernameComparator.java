import java.util.Comparator;

public class PlayerUsernameComparator implements Comparator<Player> {

    @Override
    public int compare(Player p1, Player p2) {
        String u1 = (p1 != null && p1.getUsername() != null) ? p1.getUsername() : "";
        String u2 = (p2 != null && p2.getUsername() != null) ? p2.getUsername() : "";
        return u1.compareToIgnoreCase(u2);
    }
}
