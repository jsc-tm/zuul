public class LOOKcommand extends Command {
    public LOOKcommand(CommandWord firstWord, String secondWord)
    {
        super(firstWord, secondWord);
    }

    public boolean execute(Player player)
    {
        System.out.println(player.getCurrentRoom().getLongDescription());
        return false;
    }
}
