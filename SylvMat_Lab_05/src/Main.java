import java.util.Iterator;

/**
 * Name: Matthew Sylvester
 * Date: February 20th
 * Description: Submission for the 5th lab for CS321. This package implements three classes, including the Player and
 * container Team classes, as well as a Main class for testing.
 */

public class Main {
    public static void main(String[] args) {

        //Creating the first test teams and players
        Team teamA = new Team("Tigers", 17);
        Team teamB = new Team();
        Player bob = new Player();
        Player alice = new Player();

        //Inserting another player with the same name and position
        teamA.insert(bob);
        teamA.insert(alice);

        //Creating 17 players
        Player p1 = new Player("p1",1);
        Player p2 = new Player("p2",2);
        Player p3 = new Player("p3",3);
        Player p4 = new Player("p4",4);
        Player p5 = new Player("p5",5);
        Player p6 = new Player("p6",6);
        Player p7 = new Player("p7",7);
        Player p8 = new Player("p8",8);
        Player p9 = new Player("p9",9);
        Player p10 = new Player("p10",10);
        Player p11 = new Player("p11",11);
        Player p12 = new Player("p12",12);
        Player p13 = new Player("p13",13);
        Player p14 = new Player("p14",14);
        Player p15 = new Player("p15",15);
        Player p16 = new Player("p16",16);
        Player p17 = new Player("p17",17);

        //Adding the players to the teams
        teamA.insert(p1);
        teamA.insert(p2);
        teamA.insert(p3);
        teamA.insert(p4);
        teamA.insert(p5);
        teamA.insert(p6);
        teamA.insert(p7);
        teamA.insert(p8);
        teamA.insert(p9);
        teamA.insert(p10);
        teamA.insert(p11);
        teamA.insert(p12);
        teamA.insert(p13);
        teamA.insert(p14);
        teamA.insert(p15);
        teamA.insert(p16);

        teamB.insert(p1);
        teamB.insert(p2);
        teamB.insert(p3);
        teamB.insert(p4);
        teamB.insert(p5);
        teamB.insert(p6);
        teamB.insert(p7);
        teamB.insert(p8);
        teamB.insert(p9);
        teamB.insert(p10);
        teamB.insert(p11);
        teamB.insert(p12);
        teamB.insert(p13);
        teamB.insert(p14);
        teamB.insert(p15);
        teamB.insert(p16);
        teamB.insert(p17);

        //Testing to see if we can insert an 18th player to teamA
        teamA.insert(p17);

        //Testing to see if contains works properly
        System.out.println(teamA.contains(p1));
        System.out.println(teamA.contains(p17));

        Iterator<Player> i = teamB.iterator();
        int c = 0;
        while (i.hasNext()) {
            c++;
            System.out.println("Player %s is: ".formatted(c) + i.next());
        }
    }
}