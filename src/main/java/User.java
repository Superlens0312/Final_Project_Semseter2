public abstract class User {
    protected String username;
    protected int id;

    public User(String username, int id) {
        this.username = username;
        this.id = id;
    }

    /**
     * displays the stats of a User
     */
    public abstract void displaystats();

    public String getUsername() {
        return username;
    }

    public int getId() {
        return id;
    }
}
