package abstractFactory.impl;

import abstractFactory.abstractClasses.AbstractFactory;
import abstractFactory.interfaces.Color;
import abstractFactory.interfaces.Shape;

public class ColorFactory implements AbstractFactory {

  @Override
  public Color getColor(String color) {
    switch (color) {
    case "RED":
      return new Red();
    case "GREEN":
      return new Green();
    case "BLUE":
      return new Blue();
    default:
      return null;
    }
  }

  @Override
  public Shape getShape(String shape) {
    return null;
  }

}
