package factory.controller;

import factory.impl.Circle;
import factory.impl.Rectangle;
import factory.impl.Square;
import factory.interfaces.Shape;

public class ShapeFactory {

  public Shape getShape(String shapeType) {

    switch (shapeType) {
    case "CIRCLE":
      return new Circle();

    case "SQUARE":
      return new Square();

    case "RECTANGLE":
      return new Rectangle();

    default:
      return null;
    }

  }

}
