public class PopCommand implements Command{
  private Balloon b;

  public PopCommand(Balloon b){
    this.b = b;
  }
  @Override 
  public void execute(){
    b.inflate(b.getCapacity() + 1);
  }
}
