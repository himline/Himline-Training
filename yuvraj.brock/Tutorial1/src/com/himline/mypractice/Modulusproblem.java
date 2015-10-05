package com.himline.mypractice;

import javax.swing.JOptionPane;

public class Modulusproblem {

	public static void main(String[] args) {
		int counter = 0;
		for (int i = 0 ; i<1001 ;i++){
			if(i % 3 ==0){
				counter++;
			}
			JOptionPane.showMessageDialog(null, counter);
			System.exit(0);
		}

	}

}
