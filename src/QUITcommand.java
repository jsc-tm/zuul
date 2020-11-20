public class QUITcommand extends Command
{
    /**
     * Constructor for objects of class QuitCommand
     */
    public QUITcommand(CommandWord firstWord, String secondWord)
    {
        super(firstWord, secondWord);
    }

    /**
     * "Quit" was entered. Check the argument to see whether
     * we really quit the game. Return true, if we should quit, false
     * otherwise.
     */
    public boolean execute(Player player)
    {
        if(!hasSecondWord()) {
            return true;
        }
        else {
            System.out.println("I cannot quit that...");
            return false;
        }
    }

}