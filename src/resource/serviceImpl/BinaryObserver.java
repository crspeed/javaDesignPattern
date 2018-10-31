package resource.serviceImpl;

import resource.VO.Subject;
import resource.service.Observer;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject){
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {
	     System.out.println( "Binary String: "
	    	      + Integer.toBinaryString( subject.getState() ) );
	}

}
