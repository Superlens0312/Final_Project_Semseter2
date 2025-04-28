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

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
