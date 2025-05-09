public class Organizer extends User{

    public Organizer(String username, Integer id) {
        super((username != null) ? username : "", (id != null) ? id : 0);
    }

    /**
     * Displays organizers stats
     */
    @Override
    public void displaystats() {
        System.out.println("Organizer: " + username);
    }
}
