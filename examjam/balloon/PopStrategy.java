public class PopStrategy implements BalloonInflationStrategy{

  @Override 
  public void execute(Balloon b){
    b.inflate(b.getCapacity() + 1);
  }
}
