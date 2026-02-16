public class InflateToTargetFinalCommand implements Command{

  private int amount;
  private Balloon b;
  public InflateToTargetFinalCommand(Balloon b, int amount){
    this.amount = amount;
    this.b = b;
  }

  @Override 
  public void execute(){
    int actualAmount = amount - b.getAmount();
    b.inflate(actualAmount);
  }
}
