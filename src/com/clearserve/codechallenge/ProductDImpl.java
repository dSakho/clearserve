package com.clearserve.codechallenge;

import java.math.BigDecimal;

public class ProductDImpl extends AbstractProduct implements Product {

	private static int counter;
	
	public ProductDImpl() {
		super('D', new BigDecimal(0.15d));
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
		setTotalSales(totalSales.add(price));
		ProductUtility.incrementCounter(this);
	}
	
	public static void resetCounter() {
		counter = 0;
	}
	
	@Override
	public int getCounter() {
		return counter;
	}
}