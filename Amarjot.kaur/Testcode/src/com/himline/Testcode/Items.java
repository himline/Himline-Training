package com.himline.Testcode;

import java.io.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Items {
	static double[] d = new double[5];
	static int[] arraylist = new int[5];
	static List<String> list = new ArrayList<String>();
	static List<Double> doulist = new ArrayList<Double>();
	static double sum = 0;
    static double sum1 = 0;
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// read file using fileReader-----------
		// FileReader fr = new FileReader(new File("jotttt.txt"));
		// char[] ch = new char[50];
		// fr.read(ch);
		// for (char ch1 : ch) {
		// System.out.print(ch1);
		// }
		// fr.close();

		// read file using Scanner-------------

		// Scanner sc = new Scanner(new File("jotttt.txt"));
		// HashMap<String, Integer> hm = new HashMap<String, Integer>();
		// while (sc.hasNextLine()) {
		// // System.out.println(sc.nextLine());
		// String s1 = sc.nextLine();
		// System.out.println(s1);
		// }

		// read file using BufferedReader----------
		
		System.out.println("list of items");
		String s;
		BufferedReader buffer = new BufferedReader(new FileReader("jotttt.txt"));
		while ((s = buffer.readLine()) != null) {
			list.add(s);
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.println("index of  " + i + " = " + list.get(i));
			System.out.println("enter your price = ");
			double a[] = new double[5];
			Scanner sc = new Scanner(System.in);
			a[i] = sc.nextDouble();
			doulist.add(a[i]);
		}
		for (Double d : doulist) {
			sum = sum + d;
		}
		System.out.println(" names  = " + list + " price = " + doulist);
		System.out.println("sum of list = " + sum);
		double a = 0;
		Scanner sc1 = new Scanner(System.in);
		System.out.println("enter discount = ");
	     a = sc1.nextDouble();
		sum1 = sum - a;
		System.out.println("Total after discount = " + sum1);
		Collection co = list;
		Collection coll = doulist;
		Iterator i3 = list.iterator();
		Iterator i4 = doulist.iterator();
		try {
			FileWriter fw = new FileWriter("Hash.txt");
			fw.write("List of items" + (System.getProperty("line.separator")));
			while (i3.hasNext()) {
				fw.write("" + i3.next() + " = " + i4.next() + (System.getProperty("line.separator")));
			}
			fw.write("Total = " + sum + (System.getProperty("line.separator")));
			fw.write("Total After discount = " + a);
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
