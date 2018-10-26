package resource.serviceImpl;

import resource.service.Shape2;

public class CircleFactory implements Shape2{

	@Override
	public void draw() {
		System.out.println("Inside Circle::draw() method.");
	}

}
