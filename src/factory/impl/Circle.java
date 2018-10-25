package factory.impl;

import factory.interfaces.Shape;

public class Circle implements Shape {

  @Override
  public void draw() {
    System.out.println("Circle drawing");
  }

}
