package com.himline.chapter_2;

public class DoTaxes {
	float rate;

	float doColorado() {
		SalesTaxRates str = new SalesTaxRates();
		return rate = str.salesRate;
	}
}

class SalesTaxRates {
	public float salesRate; // should be private
	public float adjustedSalesRate; // should be private

	public float getSalesRate(String region) {
		salesRate = new DoTaxes().doColorado(); // ouch again!
		// do region-based calculations
		return adjustedSalesRate;
	}
}
