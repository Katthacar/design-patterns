package factory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import factory.controller.ShapeFactory;
import factory.impl.Circle;
import factory.impl.Rectangle;
import factory.impl.Square;

public class FactoryTest {

  @Test
  public void test() {
    String circle = Circle.class.getSimpleName();
    String square = Square.class.getSimpleName();
    String rectangle = Rectangle.class.getSimpleName();

    ShapeFactory sf = new ShapeFactory();

    assertEquals(sf.getShape("CIRCLE").getClass().getSimpleName(), circle);
    assertEquals(sf.getShape("SQUARE").getClass().getSimpleName(), square);
    assertEquals(sf.getShape("RECTANGLE").getClass().getSimpleName(), rectangle);
  }

}
