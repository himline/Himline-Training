package com.himline.Testcode;

import java.io.*;

public class Pyramid {

	public static void main(String[] args) throws NumberFormatException, IOException {
      
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter value of x = ");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Enter value of y = ");
		int y = Integer.parseInt(br.readLine());
		 int z = 0;
		for(int i = 0; i <=x ;i++){
			
		for(int j =1; j <=i ;j++){
				System.out.print(z + "\t");
				z = z + y; 			
			}		
			System.out.println("");
	}
	}
}
