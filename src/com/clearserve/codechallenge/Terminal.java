package com.clearserve.codechallenge;

import java.math.BigDecimal;

public class Terminal {
	
	private char[] scannedItems;
	private BigDecimal totalPrice;
	ProductMap productMap;
	
	public Terminal() {
		totalPrice = new BigDecimal(0.0d);
		productMap = ProductMap.newInstance();
	}
	
	public void scan(String itemStr) {
		this.scannedItems = itemStr.toCharArray();
		
		for (int i = 0; i < scannedItems.length; i++) {
			char c = scannedItems[i];
			Product p = ProductUtility.getProduct(c, productMap);
			
			if (p != null) {
				p.updateSalesTotal();
				BigDecimal currentProductTotal = p.getTotalSales();
				setTotalPrice(totalPrice.add(currentProductTotal));
				adjustTotalSales(p);
			}
		}
	}
	
	public void adjustTotalSales(Product p) {
		String className = p.getClass().getName();
		if (className.equals(productMap.getProductName('A'))) {
			if (ProductUtility.getCount(p) == ProductUtility.PRODUCT_A_BULK_COUNT) {
				BigDecimal adjustedAmt = 
						new BigDecimal(ProductUtility.PRODUCT_A_REG_AMT)
							.multiply(new BigDecimal(ProductUtility.PRODUCT_A_BULK_COUNT));
				BigDecimal bulkAmount = new BigDecimal(ProductUtility.PRODUCT_A_BULK_AMT);
				setTotalPrice(totalPrice.subtract(adjustedAmt));
				setTotalPrice(totalPrice.add(bulkAmount));
				ProductAImpl.resetCounter();
			} 
		} else if (className.equals(productMap.getProductName('C'))) {
			if (ProductUtility.getCount(p) == ProductUtility.PRODUCT_C_BULK_COUNT) {
				BigDecimal adjustedAmt = 
						new BigDecimal(ProductUtility.PRODUCT_C_REG_AMT)
							.multiply(new BigDecimal(ProductUtility.PRODUCT_C_BULK_COUNT));
				BigDecimal bulkAmount = new BigDecimal(ProductUtility.PRODUCT_C_BULK_AMT);
				setTotalPrice(totalPrice.subtract(adjustedAmt));
				setTotalPrice(totalPrice.add(bulkAmount));
				ProductCImpl.resetCounter();
			} 
		}
	}
	
	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	public BigDecimal getTotalPrice() {
		return totalPrice.setScale(2, BigDecimal.ROUND_HALF_EVEN);
	}
}
