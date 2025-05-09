import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TournamentFileManager {
    /**
     * Saves players to file.
     * @param players list of players
     */
    public void savePlayers(List<Player> players) {
        if (players == null || players.isEmpty()) {
            System.out.println("No players to save.");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("players.txt"))) {
            for (Player p : players) {
                if (p != null) {
                    writer.write(p.getUsername() + "," + p.getId() + "," + p.getScore());
                    writer.newLine();
                }
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
                if (parts.length >= 2) {  // username + id must exist
                    String username = (parts[0] != null) ? parts[0].trim() : "";
                    Integer id = Integer.valueOf((parts[1] != null) ? parts[1].trim() : "");
                    Player p = new Player(username, id);
                    if (parts.length >= 3 && parts[2] != null && !parts[2].isBlank() && !parts[2].trim().equalsIgnoreCase("null")) {
                        try {
                            p.addScore(Integer.parseInt(parts[2].trim()));
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid score format for: " + username + ", setting score to 0");
                        }
                    } else {
                        System.out.println("Missing or blank score for: " + username + ", setting score to 0");
                    }
                    players.add(p);
                } else {
                    System.out.println("Invalid player entry skipped: " + line);
                }
            }
        } catch (IOException e) {
            System.out.println("No players file found or error reading file.");
        }
        return players;
    }

    /**
     * Saves tournaments to file.
     * @param tournaments list of tournaments
     */
    public void saveTournaments(List<Tournament> tournaments) {
        if (tournaments == null || tournaments.isEmpty()) {
            System.out.println("No players to save.");
            return;
        }
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("tournaments.txt"))) {
            for (Tournament t : tournaments) {
                if (t != null) {
                    writer.write(t.name);
                    writer.newLine();
                }
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
