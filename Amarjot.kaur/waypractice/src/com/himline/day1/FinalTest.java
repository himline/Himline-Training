//Final keyword
package com.himline.day1;

public class FinalTest {
      final int student;  // black final variable
      public FinalTest(int number){
    	  student=number;
      }
      void Mymethod(){
    	  System.out.println("Student no is = "+student);
      }
	public static void main(String[] args) {
		FinalTest ft = new FinalTest(12);
		//student = 10;
		//student = 20;
		ft.Mymethod();

	}

}