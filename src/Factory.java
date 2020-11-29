public class Factory {
    public Command getCommand(CommandWord command, String secondWord) {
        switch (command) {
            case DROP:
                return new DROPcommand(command, secondWord);
            case EAT:
                return new EATcommand(command, secondWord);
            case GO:
                return new GOcommand(command, secondWord);
            case HELP:
                return new HELPcommand(command, secondWord);
            case LOOK:
                return new LOOKcommand(command, secondWord);
            case QUIT:
                return new QUITcommand(command, secondWord);
            case TAKE:
                return new TAKEcommand(command, secondWord);
            case UNKNOWN:
            default:
                return new UNKNOWNcommand(command, secondWord);
        }
    }
}
