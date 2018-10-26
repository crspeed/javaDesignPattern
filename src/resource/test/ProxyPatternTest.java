package resource.test;

import resource.service.Image;
import resource.serviceImpl.ProxyImage;

public class ProxyPatternTest {
	public static void main(String[] args) {
	      Image image = new ProxyImage("test_10mb.jpg");

	      //load from disk
	      image.display();
	      System.out.println("");
	      //not to from disk
	      image.display();
	   }
}
