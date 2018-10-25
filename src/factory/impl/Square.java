package factory.impl;

import factory.interfaces.Shape;

public class Square implements Shape {

  @Override
  public void draw() {
    System.out.println("Square drawing");
  }

}
