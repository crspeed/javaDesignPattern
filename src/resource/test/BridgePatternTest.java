package resource.test;

import resource.service.Shape;
import resource.serviceImpl.Circle;
import resource.serviceImpl.GreenCircle;
import resource.serviceImpl.RedCircle;

public class BridgePatternTest {
	 public static void main(String[] args) {
	      Shape redCircle = new Circle(new RedCircle(),100, 10, 100);
	      Shape greenCircle = new Circle(new GreenCircle(),100, 10, 100);

	      redCircle.draw();
	      greenCircle.draw();
	 }
}
