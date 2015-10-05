//data hiding , data binding, encapsulation, pass by value , pass by refrence

package com.himline.day1;
enum size{small, med };
public class Encapsulate {
	int salary;
	
   size s;
	public static void main(String[] args) {
		Encapsulate e = new Encapsulate();
		e.s= size.med;
		System.out.println(e.s);
//		switch(s)
//		case small:
//		System.out.println("abcc" +s.small);
		
		
		Encapsulate o1 = new Encapsulate();
		Encapsulate o2 = new Encapsulate();
		o1.salary = 10000;
		o2.salary = o1.salary;
		System.out.println("salary of o1 =  " + o1.salary);
		System.out.println("salary of o2 =  " + o2.salary);

		o1.salary = 12000; // pass by value (assigning variable to variable)
		System.out.println("salary of o1 after change in o1 =  " + o1.salary);
		System.out.println("salary of o2  after change in o2 =  " + o2.salary);

		o1.salary = 14000;
		o2 = o1; // pass by refrence (assigning object to object)
		System.out.println("salary of o1 after change in 02 =  " + o1.salary);
		System.out.println("salary of o2 after change in o2 =  " + o2.salary);
			
		o1.salary = 6000;
		System.out.println("salary of o1 after change in 02 =  " + o1.salary);
		System.out.println("salary of o2 after change in o2 =  " + o2.salary);
	}

	}
