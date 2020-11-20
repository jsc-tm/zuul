public class LOOKcommand extends Command {
    public LOOKcommand(CommandWord firstWord, String secondWord, String words)
    {
        super(firstWord, secondWord, words);
    }

    public boolean execute(Player player)
    {
        System.out.println(player.getCurrentRoom().getLongDescription());
        return false;
    }
}
