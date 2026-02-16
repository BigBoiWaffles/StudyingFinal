public class HalfFullStrategy implements BalloonInflationStrategy {

  @Override 
  public void execute(Balloon b){
    int half = b.getCapacity() / 2;
    b.inflate(half);
  }
}
