public class TAKEcommand extends Command {
    public TAKEcommand(CommandWord firstWord, String secondWord)
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
        if (!hasSecondWord()) {
            // if there is no second word, we don't know what to take...
            System.out.println("Take what?");
            return false;
        }
        String itemName = getSecondWord();
        if (player.take(itemName)) {
            player.printLocationInfo();
        } else {
            System.out.println("There is no item here with the name " + itemName);
        }
        return false;
    }
}
