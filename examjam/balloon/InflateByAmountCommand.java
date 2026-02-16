public class InflateByAmountCommand implements Command {
  private Balloon b;
  private int amountToInflate;

  public InflateByAmountCommand(Balloon b, int amount){
    this.amountToInflate = amount;
    this.b = b;
  }

  @Override
  public void execute(){
    b.inflate(this.amountToInflate);
  }
}
