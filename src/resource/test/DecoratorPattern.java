package resource.test;

import resource.service.Shape2;
import resource.serviceImpl.CircleDecorator;
import resource.serviceImpl.RectanglerDecorator;
import resource.serviceImpl.RedShapeDecorator;

public class DecoratorPattern {
	 public static void main(String[] args) {

	      Shape2 circle = new CircleDecorator();

	      Shape2 redCircle = new RedShapeDecorator(new CircleDecorator());

	      Shape2 redRectangle = new RedShapeDecorator(new RectanglerDecorator());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	   }
}
