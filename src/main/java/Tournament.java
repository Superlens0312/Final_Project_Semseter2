public abstract class Tournament {
    protected String name;

    public Tournament(String name) {
        this.name = name;
    }

    /**
     * Displays tournament info
     */
    public abstract void displayInfo();
}
