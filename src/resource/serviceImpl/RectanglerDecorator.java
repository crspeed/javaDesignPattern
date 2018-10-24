package resource.serviceImpl;

import resource.service.Shape2;

public class RectanglerDecorator implements Shape2 {

	@Override
	public void draw() {
		System.out.println("Shape: Rectangle");
	}

}
