import java.lang.Math;

public class PerimeterCalculator implements ShapeVisitor{

  @Override
  public void visitRectangle(Rectangle r){
    double perimeter = 2 * (r.getWidth() + r.getHeight());
    System.out.println("The perimeter of this Rectangle is: " + perimeter);
  }

  @Override
  public void visitCircle(Circle c){
    double perimeter = 2 * Math.PI * c.getRadius();
    System.out.println("The perimeter of this Circle is: " + perimeter);
  }

  @Override
  public void visitTriangle(Triangle t){
    double perimeter = t.getSideOne() + t.getSideTwo() + t.getBase();
    System.out.println("The perimeter of this Triangle is: " + perimeter);
  }
}
