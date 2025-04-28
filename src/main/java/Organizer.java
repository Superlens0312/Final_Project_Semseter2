public class Organizer extends User{

    public Organizer(String username, int id) {
        super(username, id);
    }

    /**
     * Displays organizers stats
     */
    @Override
    public void displaystats() {
        System.out.println("Organizer: " + username);
    }
}
