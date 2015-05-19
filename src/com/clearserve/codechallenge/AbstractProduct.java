package com.clearserve.codechallenge;

import java.math.BigDecimal;

public abstract class AbstractProduct implements Product {
	
	protected char productCode;
	protected BigDecimal price;
	protected BigDecimal totalSales;
	protected BigDecimal zeroBase = new BigDecimal(0.0d);
	
	public AbstractProduct(char productCode, BigDecimal price) {
		setProductCode(productCode);
		setPrice(price);
		totalSales = new BigDecimal(0.0d);
	}
	
	protected void setProductCode(char productCode) {
		this.productCode = productCode;
	}
	
	protected char getProductCode() {
		return productCode;
	}
	
	protected void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	protected BigDecimal getPrice() {
		return price;
	}
	
	protected void setTotalSales(BigDecimal totalSales) {
		this.totalSales = totalSales;
	}
	
	public BigDecimal getTotalSales() {
		return totalSales;
	}
}
