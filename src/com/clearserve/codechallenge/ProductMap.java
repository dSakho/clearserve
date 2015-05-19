package com.clearserve.codechallenge;

import java.util.Map;
import java.util.TreeMap;

public final class ProductMap {
	
	private Map<Character, String> productMap;
	
	private ProductMap() {
		initializeMap();
	}
	
	{
		productMap = new TreeMap<>();
	}
	
	public static ProductMap newInstance() {
		return new ProductMap();
	}
	
	private void initializeMap() {
		if (productMap == null) {
			productMap = new TreeMap<>();
		}
		
		productMap.put('A', "clearserve.ProductAImpl");
		productMap.put('B', "clearserve.ProductBImpl");
		productMap.put('C', "clearserve.ProductCImpl");
		productMap.put('D', "clearserve.ProductDImpl");
	}
	
	public String getProductName(char productCode) {
		return productMap.get(productCode);
	}

}
