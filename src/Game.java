/**
 * This class is the main class of the "World of Zuul" application.
 * "World of Zuul" is a very simple, text based adventure game.  Users
 * can walk around some scenery. That's all. It should really be extended
 * to make it more interesting!
 * <p>
 * To play this game, create an instance of this class and call the "play"
 * method.
 * <p>
 * This main class creates and initialises all the others: it creates all
 * rooms, creates the parser and starts the game.  It also evaluates and
 * executes the commands that the parser returns.
 *
 * @author Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class Game {
    private Parser parser;
    private Player player;

    /**
     * Create the game and initialise its internal map.
     */
    public Game() {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms() {
        Room outside, theater, pub, lab, office, cellar;
        Item promoBoard, ashtray;

        // create the rooms
        outside = new Room("outside the main entrance of the university");
        theater = new Room("in a lecture theater");
        pub = new Room("in the campus pub");
        lab = new Room("in a computing lab");
        office = new Room("in the computing admin office");
        cellar = new Room("in the cellar");

        // create the items
        promoBoard = new Item("promoboard", "University promoboard", 2.3);
        ashtray = new Item("ashtray", "Big yellow ashtray", 4.6);

        // initialise room exits
        outside.setExit("east", theater);
        outside.addItem(promoBoard);
        outside.addItem(ashtray);
        outside.setExit("south", lab);
        outside.setExit("west", pub);
        theater.setExit("west", outside);
        pub.setExit("east", outside);
        lab.setExit("north", outside);
        lab.setExit("east", office);
        office.setExit("west", lab);
        office.setExit("down", cellar);
        cellar.setExit("up", office);

        this.player = new Player("Tom", outside);
    }

    /**
     * Main play routine.  Loops until end of play.
     */
    public void play() {
        printWelcome();

        // Enter the main command loop.  Here we repeatedly read commands and
        // execute them until the game is over.
        boolean finished = false;
        Command command;
        while(! finished) {
            try {
                command = parser.getCommand();
                finished = command.execute(player);
            } catch (Exception e) {
                System.out.println("I don't understand...");
            }
        }
        System.out.println("Thank you for playing.  Good bye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome() {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type '" + CommandWord.HELP.toString() + "' if you need help.");
        System.out.println();
        player.printLocationInfo();
    }

    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
