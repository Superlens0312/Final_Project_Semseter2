public class Player extends User implements Comparable<Player> {
    private int score;

    public Player(String username, int id, int score) {
        super(username, id);
        this.score = 0;
    }

    /**
     * Increases te player's score
     * @param points
     */
    public void addscore(int points) {
        this.score += points;
    }

    @Override
    public void displaystats() {
        System.out.println("Player: " + username + ", score: " + score);
    }

    /**
     * Compares players by their score for ranking purposes
     * @param other the player being compared
     * * @return the comparison result
     */
    @Override
    public int compareTo(Player other) {
        return this.score - other.score;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
