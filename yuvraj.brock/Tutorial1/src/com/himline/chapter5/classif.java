package com.himline.chapter5;

public class classif {

	public static void main(String[] args) {
		int price = 350;
		// TODO Auto-generated method stub
		if (price < 300) {
			buyProduct();
		} else {
			if (price < 400) {
				getApproval();
			} else {
				buyProduct();
			}
		}
	}

	private static void getApproval() {
		// TODO Auto-generated method stub
		System.out.print("Approved");
	}

	private static void buyProduct() {
		// TODO Auto-generated method stub
		System.out.print("less than 300");

	}

}
