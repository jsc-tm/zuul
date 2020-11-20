public class HelpCommand extends Command
{
    private CommandWords commandWords;

    /**
     * Constructor for objects of class HelpCommand
     */
    public HelpCommand(CommandWord firstWord, String secondWord, CommandWords words)
    {
        super(firstWord, secondWord);
        commandWords = words;
    }

    /**
     * Print out some help information. Here we print some stupid,
     * cryptic message and a list of the command words.
     * Returns always false.
     */
    public boolean execute(Player player)
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        commandWords.showAll();
        return false;
    }
}