package com.himline.chapter4;

import javax.swing.JButton;

public class CompareReference {

	public static void main(String[] args)
	{
		JButton a = new JButton("exit");
		JButton b = new JButton("exit");
        JButton c = a;
        System.out.println(" Is Reference a == b?" + (a == b));
        System.out.println(" Is Reference a == c?" + (a == c));
	}

}
