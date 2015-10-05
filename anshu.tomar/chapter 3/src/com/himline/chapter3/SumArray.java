package com.himline.chapter3;

public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum =0;
		int[] apple = { 10,20,30,45};
		for(int counter=0;counter<apple.length;counter++){
			sum+= apple[counter];
		}
			System.out.println("The sum of these number are"  +sum);
			
		}

	}


