package resource.VO;

import resource.service.Strategy;

public class ContextStrategy {
	private Strategy strategy;

	public ContextStrategy(Strategy strategy) {
		super();
		this.strategy = strategy;
	}
	public int executeStrategy(int num1, int num2){
		return strategy.doOparetion(num1, num2);
	}
}
