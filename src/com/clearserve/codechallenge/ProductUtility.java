package com.clearserve.codechallenge;

public class ProductUtility {
	
	public static final int PRODUCT_A_BULK_COUNT = 4;
	public static final double PRODUCT_A_REG_AMT = 2.0d;
	public static final double PRODUCT_A_BULK_AMT = 7.0d;
	public static final int PRODUCT_C_BULK_COUNT = 6;
	public static final double PRODUCT_C_REG_AMT = 1.25d;
	public static final double PRODUCT_C_BULK_AMT = 6.0d;

	public static void resetAllProducts() {
		ProductAImpl.resetCounter();
		ProductBImpl.resetCounter();
		ProductCImpl.resetCounter();
		ProductDImpl.resetCounter();
	}
	
	public static Product getProduct(char c, ProductMap productMap) {
		Product product = ProductFactory.getProductType(c, productMap);
		return product;
	}
	
	public static int getCount(Product p) {
		return p.getCounter();
	}
	
	public static void incrementCounter(Product p) {
		p.incrementCounter();
	}
}
