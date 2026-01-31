public class RemoteControl{
  Command currCommand;

  public RemoteControl(Command currCommand){
    this.currCommand = currCommand;
  }

  public void setCommand(Command command){
    System.out.println("Current command set to " + this.currCommand);
    this.currCommand = command;
  }

  public void executeCommand(){
    this.currCommand.execute();
  }
}
