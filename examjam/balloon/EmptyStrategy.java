public class EmptyStrategy implements BalloonInflationStrategy {

  @Override
  public void execute(Balloon b){
    b.inflate(0);
  }
}
