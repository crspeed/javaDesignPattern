package resource.test;

import resource.VO.Subject;
import resource.serviceImpl.BinaryObserver;
import resource.serviceImpl.HexaObserver;
import resource.serviceImpl.OctalObserver;

public class ObserverPatternTest {
	public static void main(String[] args) {
	      Subject subject = new Subject();

	      new HexaObserver(subject);
	      new OctalObserver(subject);
	      new BinaryObserver(subject);

	      System.out.println("First state change: 15");
	      subject.setState(15);
	      System.out.println("Second state change: 10");
	      subject.setState(10);
	   }
}
