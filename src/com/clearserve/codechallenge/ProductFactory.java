package com.clearserve.codechallenge;

public class ProductFactory {
	
	public static Product getProductType(char productCode, ProductMap productMap) {
		Product p = null;
		String productName = productMap.getProductName(productCode);
		
		try {
			p = (Product) Class.forName(productName).newInstance();
		} catch (ClassNotFoundException | IllegalAccessException | InstantiationException e) {
			System.err.println("Cannot create a product object of an unknown product");
			throw new RuntimeException("Exiting Program");
		}
		
		return p;
	}
}
