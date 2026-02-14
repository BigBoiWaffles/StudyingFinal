import java.lang.Math;

public class AreaCalculator implements ShapeVisitor{
  @Override
  public void visitRectangle(Rectangle r){
    double area = r.getHeight() * r.getWidth();
    System.out.println("The area of this Rectangle is: " + area);
  }

  @Override
  public void visitCircle(Circle c){
    double area = Math.PI * Math.pow(c.getRadius(), 2);
    System.out.println("The area of this Circle is: " + area);
  }

  @Override
  public void visitTriangle(Triangle t){
    double area = (t.getBase() * t.getHeight()) / 2;
    System.out.println("The area of this Triangle is: " + area);
  }
}
