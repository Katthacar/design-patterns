package abstractFactory;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import abstractFactory.abstractClasses.AbstractFactory;
import abstractFactory.controller.FactoryProducer;
import abstractFactory.impl.Blue;
import abstractFactory.impl.Circle;
import abstractFactory.impl.Green;
import abstractFactory.impl.Rectangle;
import abstractFactory.impl.Red;
import abstractFactory.impl.Square;
import abstractFactory.interfaces.Color;
import abstractFactory.interfaces.Shape;

public class AbstractFactoryTest {

  @Test
  public void test() {
    String red = Red.class.getSimpleName();
    String green = Green.class.getSimpleName();
    String blue = Blue.class.getSimpleName();
    
    String circle = Circle.class.getSimpleName();
    String square = Square.class.getSimpleName();
    String rectangle = Rectangle.class.getSimpleName();
    
    AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
    AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
    
    Shape c = shapeFactory.getShape("CIRCLE"); 
    Shape s = shapeFactory.getShape("SQUARE"); 
    Shape r = shapeFactory.getShape("RECTANGLE");
    
    Color rd = colorFactory.getColor("RED"); 
    Color gr = colorFactory.getColor("GREEN"); 
    Color bl = colorFactory.getColor("BLUE"); 
    
    assertEquals(red, rd.getClass().getSimpleName());
    assertEquals(green, gr.getClass().getSimpleName());
    assertEquals(blue, bl.getClass().getSimpleName());
    
    assertEquals(circle, c.getClass().getSimpleName());
    assertEquals(square, s.getClass().getSimpleName());
    assertEquals(rectangle, r.getClass().getSimpleName());
    
   
  }

}
