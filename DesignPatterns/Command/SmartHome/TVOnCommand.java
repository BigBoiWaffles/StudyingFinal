public class TVOnCommand implements Command{
  TV tele;

  public TVOnCommand(TV tele){
    this.tele = tele;
  }

  @Override
  public void execute(){
    this.tele.setOn();
    this.tele.setVolume(50);
  }
}
