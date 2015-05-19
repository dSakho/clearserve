package com.clearserve.codechallenge;

import java.math.BigDecimal;

public interface Product {
	void incrementCounter();
	int getCounter();
	void updateSalesTotal();
	BigDecimal getTotalSales();
}
