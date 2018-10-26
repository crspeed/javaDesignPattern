package resource.test;

import resource.service.Shape2;
import resource.serviceImpl.ShapeFactory;
import resource.serviceImpl.ShapeFactoryPattern;

public class FactoryPatternTest {
	 public static void main(String[] args) {
	      ShapeFactoryPattern shapeFactory = new ShapeFactoryPattern();

	      //
	      Shape2 shape1 = shapeFactory.getShape("CIRCLE");

	      //to call draw()
	      shape1.draw();

	      //
	      Shape2 shape2 = shapeFactory.getShape("RECTANGLE");

	      //
	      shape2.draw();

	      //
	      Shape2 shape3 = shapeFactory.getShape("SQUARE");

	      //
	      shape3.draw();
	   }
}
