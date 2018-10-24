package resource.serviceImpl;

import resource.service.Shape2;

public class ShapeDecorator implements Shape2{
	protected Shape2 decoratedShape;

	public ShapeDecorator(Shape2 decoratedShape) {
		super();
		this.decoratedShape = decoratedShape;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
	}

}
