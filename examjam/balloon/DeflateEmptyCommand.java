public class DeflateEmptyCommand implements Command {
  private Balloon b;

  public DeflateEmptyCommand(Balloon b){
    this.b = b;
  }

  @Override
  public void execute(){
    while (b.getAmount() != 0){
      b.deflate(1);
    }
  }
}
