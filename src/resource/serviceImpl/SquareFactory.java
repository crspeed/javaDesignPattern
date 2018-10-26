package resource.serviceImpl;

import resource.service.Shape2;

public class SquareFactory implements Shape2{

	@Override
	public void draw() {
		 System.out.println("Inside Square::draw() method.");
	}

}
