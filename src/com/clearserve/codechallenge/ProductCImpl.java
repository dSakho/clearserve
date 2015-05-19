package com.clearserve.codechallenge;

import java.math.BigDecimal;

public class ProductCImpl extends AbstractProduct implements Product {

	protected BigDecimal bulkPrice;
	private static int counter;
	
	public ProductCImpl() {
		super('C', new BigDecimal(1.25d));
		bulkPrice = new BigDecimal(6.0d);
	}
	
	static {
		counter = 0;
	}
	
	@Override
	public void incrementCounter() {
		counter++;
	}

	@Override
	public void updateSalesTotal() {
		if (counter != 0 && counter % 6 == 0) {
			setTotalSales(zeroBase);
			setTotalSales(totalSales.add(bulkPrice));
		} else {
			setTotalSales(totalSales.add(price));
			ProductUtility.incrementCounter(this);
		}
	}
	
	public static void resetCounter() {
		counter = 0;
	}
	
	@Override
	public int getCounter() {
		return counter;
	}
}