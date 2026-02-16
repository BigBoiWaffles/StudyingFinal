public class FullStrategy implements BalloonInflationStrategy {

  @Override 
  public void execute(Balloon b){
    b.inflate(b.getCapacity());
  }
}
