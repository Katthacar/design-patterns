package abstractFactory.controller;

import abstractFactory.abstractClasses.AbstractFactory;
import abstractFactory.impl.ColorFactory;
import abstractFactory.impl.ShapeFactory;

public class FactoryProducer {

  public static AbstractFactory getFactory(String typeFactory) {

    if (typeFactory.equals("SHAPE"))
      return new ShapeFactory();
    else if (typeFactory.equals("COLOR"))
      return new ColorFactory();
    return null;

  }

}
