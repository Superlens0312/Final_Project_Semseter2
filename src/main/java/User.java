public abstract class User {
    protected String username;
    protected int id;

    public User(String username, Integer id) {
        this.username = (username != null) ? username : "";
        this.id = (id != null) ? id : 0;
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
