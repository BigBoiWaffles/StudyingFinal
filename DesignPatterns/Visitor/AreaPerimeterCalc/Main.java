import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Create instances of your concrete elements (Shapes)
        // Note: We can store them as the interface type 'Shape'
        Shape myRectangle = new Rectangle(5, 10); // Height 5, Width 10
        Shape myCircle = new Circle(7);           // Radius 7
        Shape myTriangle = new Triangle(4, 6, 5, 5); // Height 4, Base 6, Sides 5 & 5

        // 2. Add them to a list (simulating a collection of mixed shapes)
        List<Shape> shapeList = new ArrayList<>();
        shapeList.add(myRectangle);
        shapeList.add(myCircle);
        shapeList.add(myTriangle);

        // 3. Create your Visitors
        ShapeVisitor areaVisitor = new AreaCalculator();
        ShapeVisitor perimeterVisitor = new PerimeterCalculator();

        // 4. Execute the Area Visitor on all shapes
        System.out.println("--- Calculating Areas ---");
        for (Shape shape : shapeList) {
            // The 'accept' method handles the double-dispatch to find the right method
            shape.accept(areaVisitor);
        }

        System.out.println(); // Blank line for readability

        // 5. Execute the Perimeter Visitor on all shapes
        System.out.println("--- Calculating Perimeters ---");
        for (Shape shape : shapeList) {
            shape.accept(perimeterVisitor);
        }
    }
}
