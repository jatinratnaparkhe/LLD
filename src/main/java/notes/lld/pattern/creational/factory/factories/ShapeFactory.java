package notes.lld.pattern.creational.factory.factories;

import notes.lld.pattern.creational.factory.*;

public class ShapeFactory {
    public static Shape getShape(ShapeType input) {
        return switch (input) {
            case CIRCLE -> new Circle();
            case SQUARE -> new Square();
            case TRIANGLE -> new Triangle();
            case null -> throw new IllegalArgumentException("Shape type cannot be null");
            default -> throw new IllegalArgumentException("Unsupported shape: " + input);
        };
    }
}
