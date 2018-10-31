package resource.service;

import resource.VO.Subject;

public abstract class Observer {
	protected Subject subject;
	public abstract void update();
}
