package com.clearserve.codechallenge;

import java.math.BigDecimal;

public class ProductAImpl extends AbstractProduct implements Product {

	protected BigDecimal bulkPrice;
	private static int counter;
	
	static {
		counter = 0;
	}
	
	public ProductAImpl() {
		super('A', new BigDecimal(2.0d));
		bulkPrice = new BigDecimal(7.0d);
	}

	@Override
	public void incrementCounter() {
		counter++;
	}

	@Override
	public void updateSalesTotal() {
		if (counter != 0 && counter % 4 == 0) {
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