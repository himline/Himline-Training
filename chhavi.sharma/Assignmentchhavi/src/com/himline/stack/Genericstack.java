package com.himline.stack;

import java.util.*;

public class Genericstack {

	public static void main(String args[]){ // 1. Stack that stores only int value
												
		Stack<Integer> st1 = new Stack<Integer>(); // generics int stack
		st1.add(10);
		st1.add(20);
		st1.add(30);
		st1.add(40);
		System.out.print("Printing int stack: ");
		for (int i: st1) {
			System.out.println(i);
			System.out.println("");
		}

	}


}
