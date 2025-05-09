public class Player extends User implements Comparable<Player> {
    private int score;

    public Player(String username, Integer id) {
        super((username != null) ? username : "", (id != null) ? id : 0);
        this.score = 0;
    }

    /**
     * Increases te player's score
     * @param points score to be added
     */
    public void addScore(Integer points) {
        if (points != null) {
            this.score += points;
            if (this.score < 0) {
                System.out.println("Warning: Negative total score detected, resetting to 0.");
                this.score = 0;
            }
        } else {
            System.out.println("Null points provided, no score change.");
        }
    }

    @Override
    public void displaystats() {
        System.out.println("Player: " + username + " | score: " + score);
    }

    /**
     * Compares players by their score for ranking purposes
     * @param other the player being compared
     * * @return the comparison result
     */
    @Override
    public int compareTo(Player other) {
        if (other == null) return -1;
        if (this.score == other.score) return 0;
        return  Integer.compare(other.score, this.score);
    }

    public int getScore() {
        return score;
    }
}
