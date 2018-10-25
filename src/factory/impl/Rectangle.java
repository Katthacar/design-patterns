package factory.impl;

import factory.interfaces.Shape;

public class Rectangle implements Shape {

  @Override
  public void draw() {
    System.out.println("Rectangle drawing");
  }

}
