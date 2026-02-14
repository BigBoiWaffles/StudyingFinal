public class Circle implements Shape{
  
  private int radius;

  public Circle(int radius){
    this.radius = radius;
  }

  public int getRadius(){ return this.radius; }

  @Override
  public void accept(ShapeVisitor visitor){
    visitor.visitCircle(this);
  }
}
