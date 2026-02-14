public class Triangle implements Shape{
  private int sideOne;
  private int sideTwo;
  private int height;
  private int base;

  public Triangle(int height, int base, int sideOne, int sideTwo){
    this.height = height;
    this.base = base;
    this.sideOne = sideOne;
    this.sideTwo = sideTwo;
  }

  public int getHeight(){ return this.height; }
  public int getBase(){ return this.base; }
  public int getSideOne(){ return this.sideOne; }
  public int getSideTwo(){ return this.sideTwo; }

  @Override
  public void accept(ShapeVisitor visitor){
    visitor.visitTriangle(this);
  }
}
