public class InflateFullCommand implements Command{
  private Balloon b;

  public InflateFullCommand(Balloon b){
    this.b = b;
  }
  @Override 
  public void execute(){
    while(b.getAmount() != b.getCapacity()){
      b.inflate(1);
    }
  }
}
