//using this keyword
package com.himline.day1;

public class ThisKeyword {
	int salary = 12000;

	public void display(int salary) {
		this.salary = salary;
	}

	public static void main(String[] args) {
		ThisKeyword tk = new ThisKeyword();
		tk.display(10000);
		System.out.println("salary  =  " + tk.salary);

	}

}
