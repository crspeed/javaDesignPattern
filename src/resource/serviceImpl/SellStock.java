package resource.serviceImpl;

import resource.VO.Stock;
import resource.service.Order;

public class SellStock implements Order{
	private Stock abcStock;


	public SellStock(Stock abcStock) {
		super();
		this.abcStock = abcStock;
	}

	@Override
	public void execute() {
		abcStock.sell();
	}

}
