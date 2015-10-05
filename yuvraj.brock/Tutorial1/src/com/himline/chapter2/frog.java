package com.himline.chapter2;

public class frog {
	
		static int frogCount = 0; // Declare and initialize
		// static variable
		public frog() {
		frogCount += 1; // Modify the value in the constructor
		}
		public static void main (String [] args) {
		new frog();
		new frog();
		new frog();
		System.out.println("Frog count is now " + frogCount);
		}
		}

