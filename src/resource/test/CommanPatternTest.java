package resource.test;

import resource.VO.Stock;
import resource.serviceImpl.Brocker;
import resource.serviceImpl.BuyStock;
import resource.serviceImpl.SellStock;

public class CommanPatternTest {
	public static void main(String[] args) {
	      Stock abcStock = new Stock();

	      BuyStock buyStockOrder = new BuyStock(abcStock);
	      SellStock sellStockOrder = new SellStock(abcStock);

	      Brocker broker = new Brocker();
	      broker.takeOrder(buyStockOrder);
	      broker.takeOrder(sellStockOrder);

	      broker.placeOrders();
	   }
}
