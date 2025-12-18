package balloon.commands;

public class BalloonCommandInvoker {
    private BalloonCommand command;

    public BalloonCommandInvoker(){
        this.command = null;
    }

    public void setCommand(BalloonCommand command) {
        this.command = command;
    }

    public void executeCommand(){
        command.execute();
    }
}
