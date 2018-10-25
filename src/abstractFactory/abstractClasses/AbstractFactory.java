package abstractFactory.abstractClasses;

import abstractFactory.interfaces.Color;
import abstractFactory.interfaces.Shape;

public interface AbstractFactory {

  public Shape getShape(String shape);

  public Color getColor(String color);

}
