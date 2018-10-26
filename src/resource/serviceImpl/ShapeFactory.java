package resource.serviceImpl;

import java.util.HashMap;

import resource.service.Shape2;

public class ShapeFactory {
	private static final HashMap<String, Shape2> circleMap=new HashMap();
	public static Shape2 getCircle(String color){
		CircleFlyweight circle= (CircleFlyweight) circleMap.get(color);

		if(circle == null){
			circle=new CircleFlyweight(color);
			circleMap.put(color, circle);
			 System.out.println("Creating circle of color : " + color);
		}
		return circle;
	}

}
