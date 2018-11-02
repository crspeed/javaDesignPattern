package resource.test;

import resource.VO.ContextStrategy;
import resource.serviceImpl.OparetionAdd;
import resource.serviceImpl.OperationMultiply;
import resource.serviceImpl.OperationSubstract;

public class StrategyPatternTest {
	 public static void main(String[] args) {
	      ContextStrategy context = new ContextStrategy(new OparetionAdd());
	      System.out.println("10 + 5 = " + context.executeStrategy(10, 5));

	      context = new ContextStrategy(new OperationSubstract());
	      System.out.println("10 - 5 = " + context.executeStrategy(10, 5));

	      context = new ContextStrategy(new OperationMultiply());
	      System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	   }
}
