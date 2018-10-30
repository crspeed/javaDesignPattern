package resource.test;

import resource.service.Iterator;
import resource.serviceImpl.NameReposity;

public class IteratorPatternTest {
	public static void main(String[] args) {
	      NameReposity namesRepository = new NameReposity();

	      for(Iterator iter =  namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      }
	   }
}
