public class InflateHalfFullCommand implements Command{
  private Balloon b;

  public InflateHalfFullCommand(Balloon b){
    this.b = b;
  }
  @Override 
  public void execute(){
    while (b.getAmount() != (b.getCapacity() / 2)){
      b.inflate(1);
    }
  }
}
