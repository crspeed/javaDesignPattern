package resource.serviceImpl;

import resource.service.Shape2;

public class ShapeMaker {
	private Shape2 circle;
	private Shape2 rectangler;
	private Shape2 square;

	public ShapeMaker(){
		circle=new CircleFacade();
		rectangler=new Rectangler();
		square=new Square();
	}
	public void drawCircle(){
		circle.draw();
	}
	public void drawRectangler(){
		rectangler.draw();
	}
	public void drawSquare(){
		square.draw();
	}
}
