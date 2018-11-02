package resource.serviceImpl;

import resource.service.Strategy;

public class OperationMultiply implements Strategy{

	@Override
	public int doOparetion(int num1, int num2) {
		return num1 * num2;
	}

}
