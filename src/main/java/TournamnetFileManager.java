import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TournamnetFileManager {
    /**
     * Saves players to file.
     * @param players list of players
     */
    public void savePlayers(List<Player> players) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("players.txt"))) {
            for (Player p : players) {
                writer.write(p.getUsername() + "," + p.getId() + "," + p.getScore());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads players from file.
     * @return list of players
     */
    public List<Player> loadPlayers() {
        List<Player> players = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader("players.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    Player p = new Player(parts[0], Integer.parseInt(parts[1]),Integer.parseInt(parts[2]));
                    p.addScore(Integer.parseInt(parts[2]));
                    players.add(p);
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return players;
    }

    /**
     * Saves tournaments to file.
     * @param tournaments list of tournaments
     */
    public void saveTournaments(List<Tournament> tournaments) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tournaments.txt"))) {
            for (Tournament t : tournaments) {
                writer.write(t.getClass().getSimpleName() + "," + t.name);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Loads tournaments from file.
     * @return list of tournaments
     */
    public List<Tournament> loadTournaments() {
        List<Tournament> tournaments = new ArrayList<>();
        // Placeholder: full deserialization would require type and structure
        return tournaments;
    }
}
