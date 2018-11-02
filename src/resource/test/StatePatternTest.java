package resource.test;

import resource.VO.Context;
import resource.service.State;
import resource.serviceImpl.StartState;
import resource.serviceImpl.StopState;

public class StatePatternTest {
	public static void main(String[] args) {
	      Context context = new Context();

	      State startState = new StartState();
	      startState.doAction(context);

	      System.out.println(context.getState().toString());

	      StopState stopState = new StopState();
	      stopState.doAction(context);

	      System.out.println(context.getState().toString());
	   }
}
