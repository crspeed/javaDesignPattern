package resource.serviceImpl;

import resource.service.Shape2;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(Shape2 decoratedShape) {
		super(decoratedShape);
	}
	@Override
	public void draw() {
		decoratedShape.draw();
		setRedBorder(decoratedShape);
	}
	private void setRedBorder(Shape2 decoratedShape){
	      System.out.println("Border Color: Red");
	}
}
