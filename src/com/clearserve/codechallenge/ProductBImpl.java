package com.clearserve.codechallenge;

import java.math.BigDecimal;

public class ProductBImpl extends AbstractProduct implements Product {

	private static int counter;
	
	static {
		counter = 0;
	}
	
	public ProductBImpl() {
		super('B', new BigDecimal(12.0d));
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