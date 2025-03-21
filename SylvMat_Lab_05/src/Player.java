/**
 * Player class. Implements a name and position.
 */
public class Player {
    private String name;
    private int position;

    /**
     * Default constructor. Assigns null name and position.
     */
    public Player() {
        name = "";
        position = 0;
    }

    /**
     * Constructor with arguments.
     * @param name the String name
     * @param position the int position
     */
    public Player(String name, int position) {
        this.name = name;
        this.position = position;
    }

    /**
     * Name setter.
     * @param name the String name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Name getter.
     * @return the string name
     */
    public String getName() {
        return name;
    }

    /**
     * Position setter.
     * @param position the int position
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Position getter.
     * @return the int position
     */
    public int getPosition() {
        return position;
    }

    /**
     * Override of toString method.
     * @return the String name
     */
    public String toString() {
        return name;
    }

    /**
     * Tests to see if this Player is a duplicate of another Player.
     * @param p the Player to compare against
     * @return boolean, true if the players are duplicate and false otherwise
     */
    public boolean equals(Player p) {
        return (name.equals(p.getName()) && position == p.getPosition());
    }
}
