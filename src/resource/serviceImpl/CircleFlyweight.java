package resource.serviceImpl;

import resource.service.Shape2;

public class CircleFlyweight implements Shape2{
	private int x, y, radius;
	private String color;



	public CircleFlyweight(String color) {
		super();
		this.color = color;
	}


	public void setX(int x) {
		this.x = x;
	}



	public void setY(int y) {
		this.y = y;
	}



	public void setRadius(int radius) {
		this.radius = radius;
	}



	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color
		         +", x : " + x +", y :" + y +", radius :" + radius);
	}

}
