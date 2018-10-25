package abstractFactory.impl;

import abstractFactory.abstractClasses.AbstractFactory;
import abstractFactory.interfaces.Color;
import abstractFactory.interfaces.Shape;

public class ShapeFactory implements AbstractFactory {

  @Override
  public Shape getShape(String shape) {
    switch (shape) {
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

  @Override
  public Color getColor(String color) {
    return null;
  }

}
