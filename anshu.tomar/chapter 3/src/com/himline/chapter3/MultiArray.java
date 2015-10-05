package com.himline.chapter3;

public class MultiArray {

	public static void main(String[] args) {
		int firstarray[][]={{14,12,13,4},{1,2,6,45}};
		int secondarray[][]={{14,12,13,12},{45},{1,2,6}};
		System.out.println("this is the firsts array");
		display(firstarray);
		
		System.out.println("this is the Second array");
		display(secondarray);
	}
public static void display(int x[][]){
	for(int row=0;row<x.length;row++){
		for(int column=0;column<x[row].length;column++){
		System.out.print(x[row][column]+"\t");
		}
		System.out.println();
	}
}
}
