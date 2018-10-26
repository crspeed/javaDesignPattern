package resource.serviceImpl;

import resource.VO.Stock;
import resource.service.Order;

public class BuyStock implements Order{
	private Stock abcStock;


	public BuyStock(Stock abcStock) {
		super();
		this.abcStock = abcStock;
	}


	@Override
	public void execute() {
		abcStock.buy();
	}

}
