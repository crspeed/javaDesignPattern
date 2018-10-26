package resource.serviceImpl;

import resource.service.Shape2;

public class RectangleFactory implements Shape2{

	@Override
	public void draw() {
		System.out.println("Inside Rectangle::draw() method.");
	}

}
