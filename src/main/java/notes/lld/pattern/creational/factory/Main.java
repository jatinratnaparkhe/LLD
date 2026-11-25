package notes.lld.pattern.creational.factory;

import notes.lld.pattern.creational.factory.factories.ShapeFactory;

public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape(ShapeType.CIRCLE);
        Shape square = ShapeFactory.getShape(ShapeType.SQUARE);
        Shape triangle = ShapeFactory.getShape(ShapeType.TRIANGLE);
        circle.draw();
        square.draw();
        triangle.draw();
    }
}
