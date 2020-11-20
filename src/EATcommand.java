public class EATcommand extends Command {
    public EATcommand(CommandWord firstWord, String secondWord, String words)
    {
        super(firstWord, secondWord, words);
    }

    /**
     * "Quit" was entered. Check the argument to see whether
     * we really quit the game. Return true, if we should quit, false
     * otherwise.
     */
    public boolean execute(Player player)
    {
        System.out.println("Je hebt nu gegeten en bent niet meer hongerig\n");
        return false;
    }
}
