package com.himline.assesment;

public class EncapsTest {

	static EncapsulationExample p = new EncapsulationExample();

	public static void main(String args[]) {
		
		
		

		System.out.println("=======================encapsulation result =========================== ");
		// encapsulation testing
		EncapsulationExample obj = new EncapsulationExample();
		obj.setEmpName("yuvraj");
		obj.setEmpAge(32);
		obj.setEmpSSN(133);
		
		
		System.out.println("Employee Name: " + obj.getEmpName());
		System.out.println("Employee salary: " + obj.getEmpSSN());
		System.out.println("Employee Age: " + obj.getEmpAge());
		obj.total();

		
		
		
		
		System.out.println("=======================polymorphism result static  ======================== ");
		p.methodstatic("example static polymorphism");
		p.methodstatic("static polymorphism ", 1);

		
		
		
		
		
		
		System.out.println("=======================polymorphism result dynamic  ======================= ");

		// polymorphism example testing

		EncapsulationExample s = new Sum();
		// p.beta= 200;
		// System.out.println( p.beta);
		// p.alpha =10; //<==============================cannot be change
		// "final"
		System.out.println("polymorphism result 1: ");
		p.total(); // <============================USE OF STATIC FOR DIRECT CALL
					// OF INSTANCE
		System.out.println("polymorphism result 2: ");
		s.total();

		
		
		
		
		
		System.out.println("=======================abstraction result =================== ");
		// abstraction test example
		Sum ss = new Sum();
		ss.engine();
		ss.hell();

	}

}
