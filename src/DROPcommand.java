public class DROPcommand extends Command {
    public DROPcommand(CommandWord firstWord, String secondWord, String words)
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
        if (!hasSecondWord()) {
            // if there is no second word, we don't know what to drop...
            System.out.println("Drop what?");
            return false;
        }
        String itemName = getSecondWord();
        if (player.drop(itemName)) {
            player.printLocationInfo();
        } else {
            System.out.println("There is no item here with the name " + itemName);
        }
        return false;
    }
}
