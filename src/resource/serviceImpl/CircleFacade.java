package resource.serviceImpl;

import resource.service.Shape2;

public class CircleFacade implements Shape2{

	@Override
	public void draw() {
		System.out.println("CirCle::draw()");
	}

}
