public class FanHighCommand implements Command{
  CeilingFan fan;

  public FanHighCommand(CeilingFan fan){
    this.fan = fan;
  }

  @Override
  public void execute(){
    this.fan.setOn();
    this.fan.setSpeed("High");
  }
}
