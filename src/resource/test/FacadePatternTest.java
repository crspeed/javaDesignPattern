package resource.test;

import resource.serviceImpl.ShapeMaker;

public class FacadePatternTest {
	public static void main(String[] args) {
	      ShapeMaker shapeMaker = new ShapeMaker();

	      shapeMaker.drawCircle();
	      shapeMaker.drawRectangler();
	      shapeMaker.drawSquare();
	   }
}
