package resource.VO;

import java.util.ArrayList;
import java.util.List;

import resource.service.Observer;

public class Subject {
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllobservers();

	}

	public void attach(Observer observer){
		observers.add(observer);
	}

	public void notifyAllobservers(){
		for(Observer  observer : observers){
			observer.update();
		}
	}
}
