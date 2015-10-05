package Grossarystore;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Grossarybill {
	static double[] i = new double[50];
	static HashMap<String, Double> hm = new HashMap<String, Double>();

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		// FileReader fr = new FileReader ("taskkk.txt");

		String input = null;
		try {
			input = FilesUtil.readTextFile("taskkk.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Items in your list are  :");
		System.out.println(input);
		System.out.println("ENTER PRICE :");

		for (int j = 0; j < i.length; j++) {
			if (input.contains("fruits")) {
				System.out.println("price of fruits  :");
				i[j] = sc.nextDouble();
				hm.put("fruits", i[j]);
				System.out.println("");
			}
			if (input.contains("oats")) {
				System.out.println("price of oats  :");
				i[j] = sc.nextDouble();
				hm.put("oats", i[j]);
				System.out.println("");
			}
			if (input.contains("salt")) {
				System.out.println("price of salt  :");
				i[j] = sc.nextDouble();
				hm.put("salt", i[j]);
				System.out.println("");
			}
			if (input.contains("medicine")) {
				System.out.println("price of medicine  :");
				i[j] = sc.nextDouble();
				hm.put("medicine", i[j]);
				System.out.println("");
			}
			if (input.contains("softdrink")) {
				System.out.println("price of softdrink  :");
				i[j] = sc.nextDouble();
				hm.put("softdrink", i[j]);
				System.out.println("");
			}
			System.out.println("your items are    :" + hm);
			// System.out.println("You want any thing else ");
			// String option = sc.nextLine();
			// String Yes = "yes" ;
			//// if (option == Yes ) {
			//// String newitem = sc.nextLine();
			//// System.out.println("price of :" +sc.nextLine());
			//// i[j] = sc.nextInt();
			//// hm.put(newitem, i[j]);
			//// System.out.println("Thank you");
			//// System.out.println("your final bill items are :" + hm);
			////
			//// }
			//// else {
			//// System.out.println("your final bill items are :" + hm);
			//// }

			Set set = hm.entrySet();
			Iterator i = set.iterator();
			try {
				FileWriter fw = new FileWriter("hash.txt");

				while (i.hasNext()) {
					fw.write("your items are :     " + "\n" + i.next() + "\n" );

				}
				fw.flush();
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
