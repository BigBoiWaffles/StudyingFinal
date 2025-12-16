package ShapeFactory;

public class ShapeFactory {
    public Shape getShape(String shape){
        if (shape=="Circle") { return new Circle(); }
        if (shape=="Rectangle") { return new Rectangle(); }
        if (shape=="Triangle") { return new Triangle(); }
        return null;
    }
}
