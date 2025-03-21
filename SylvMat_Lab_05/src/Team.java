import java.util.ArrayList;
import java.util.Iterator;

/**
 * Team class. Implements a name and methods to create and interact with a roster of Player objects.
 */
public class Team {
    private String name;
    private ArrayList<Player> roster = new ArrayList<>();
    private int maxPlayers;

    /**
     * Default constructor.
     */
    public Team() {
        name = "";
        maxPlayers = 17;
    }

    /**
     * Constructor with arguments.
     * @param name string name
     * @param maxPlayers int maxPlayers
     */
    public Team(String name, int maxPlayers) {
        this.name = name;
        this.maxPlayers = maxPlayers;
    }

    /**
     * Tests whether the team contains a given player.
     * @param p0 Player to find in team
     * @return boolean true if found, false if not found
     */
    public boolean contains(Player p0){
        for(Player p1:roster){
            if(p0.equals(p1)){
                return true;
            }
        }
        return false;
    }

    /**
     * Inserts a player into the team. Will throw an exception if the player is a duplicate or if the team has already
     * reached the maximum size.
     * @param p0 the Player to be inserted
     */
    public void insert(Player p0){
        try {
            if (contains(p0)) {
                System.out.println("Team already contains " + p0);
                makeError();
            }
            if (roster.size() >= maxPlayers) {
                System.out.println("Team is full.");
                makeError();
            }
            roster.add(p0);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Generic exception.
     * @throws Exception generic exception
     */
    public void makeError() throws Exception {
        throw new Exception("This is an Exception message.");
    }

    /**
     * Method to make roster's iterator public.
     * @return the ArrayList roster's iterator
     */
    public Iterator<Player> iterator(){
        return roster.iterator();
    }

}
