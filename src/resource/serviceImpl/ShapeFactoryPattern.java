package resource.serviceImpl;

import resource.service.Shape2;

public class ShapeFactoryPattern {
	//use 'getShape' way to get factory class
	   public Shape2 getShape(String shapeType){
	      if(shapeType == null){
	         return null;
	      }
	      if(shapeType.equalsIgnoreCase("CIRCLE")){
	         return new CircleFactory();
	      } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
	         return new RectangleFactory();
	      } else if(shapeType.equalsIgnoreCase("SQUARE")){
	         return new SquareFactory();
	      }
	      return null;
	   }
}
