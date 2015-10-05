package com.himline.assesment;

public class EncapsulationExample {

	// encapsulation
	private int salary;
	private String empName;
	private int empAge;
	final int tax = 1;

	// Getter and Setter methods
	public int getEmpSSN() {
		return salary + tax;
	}

	public String getEmpName() {
		return empName;
	}

	public int getEmpAge() {
		return empAge / 2;
	}

	public void setEmpAge(int newValue) {
		empAge = newValue;
	}

	public void setEmpName(String newValue) {
		empName = newValue;
	}

	public void setEmpSSN(int newValue) {

		salary = newValue;
	}
	
	

	// ================ for static polymorphism ===========
	void methodstatic(String a) {
		System.out.println("single string" + a);
	}

	void methodstatic(String a, int b) {
		System.out.println("single string and integer" + a + b);
	}

	
	
	// ===================for dynamic polymorphism
	final int alpha = 10;
	protected int beta = 10;
	private int gama = 100;
	int grandtotal;

	
	
	
	// dynamic polymorphism code starts
	void total() {
		beta = 20; // <================================protected / can't be changed by  inherited class
		grandtotal = (alpha * beta) + gama;
		System.out.println(grandtotal);
	}
}

class Sum extends EncapsulationExample implements Ford {
	void total() {
		// alpha= 50;<===========================protected
		beta = 25;
		grandtotal = alpha * beta; // "/ gama" <========private
		System.out.println(grandtotal);
	}

	
	
	
	// <============================================ABSTRACTION CODE============================
	@Override
	public void engine() {
		System.out.println("engine for ford interface");

	}

	@Override
	public void hell() {
		System.out.println("hell for ford interface");

	}
}
