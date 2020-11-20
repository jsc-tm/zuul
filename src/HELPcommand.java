public class HELPcommand extends Command
{
    private String commandWords;

    /**
     * Constructor for objects of class HelpCommand
     */
    public HELPcommand(CommandWord firstWord, String secondWord, String words)
    {
        super(firstWord, secondWord, words);
    }

    /**
     * Print out some help information. Here we print some stupid,
     * cryptic message and a list of the command words.
     * Returns always false.
     */
    public boolean execute(Player player)
    {
        System.out.println("Player " + player.getName() + " is lost and alone, and wanders");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Possible command words are:   " + getCommands());
        System.out.println();
        return false;
    }
}