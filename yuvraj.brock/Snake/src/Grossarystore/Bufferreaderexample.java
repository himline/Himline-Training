package Grossarystore;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
import java.util.function.Consumer;

import javax.xml.crypto.dsig.spec.HMACParameterSpec;

public class Bufferreaderexample {
	/*
	 * motive : write a program to read the file data and store values in data
	 * type and sort according to index.
	 * 
	 */
	public static void main(String[] args) throws IOException {
		List<Double> hm = new ArrayList<Double>();
		double sum = 0;
		double Cashback = 0;
		int moremoney = 0;
		ArrayList<String> value = new ArrayList<String>();

		// String [] value = new String[100];
		try {
			BufferedReader br = new BufferedReader(new FileReader("taskkk.txt"));

			String readdata;
			while ((readdata = br.readLine()) != null) {
				value.add(readdata);

			}

			// System.out.println(value);
			for (int i = 0; i < value.size(); i++) {
				System.out.println("value of  " + i + " " + value.get(i));
				double a[] = new double[5];
				Scanner sc = new Scanner(System.in);
				a[i] = sc.nextDouble();
				hm.add(a[i]);

				// Advanced for loop
				for (double num : a) {

					sum = sum + num;
				}
				System.out.println("Total Amount   :" + sum);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Collection coll = hm;
		Collection coll2 = value;
		Iterator<?> i2 = coll.iterator();
		Iterator i3 = coll2.iterator();

		try {
			FileWriter fw = new FileWriter("hash.html");
			fw.write("        welcome ! to grossary store " + (System.getProperty("line.separator")));

			fw.write(
					"------------Your Bill Details Are----------------------" + (System.getProperty("line.separator")));
			fw.write((System.getProperty("line.separator")));
			for (int i = 0; i < value.size(); i++) {
				while (i2.hasNext()) {

					// fw.write(" Item name : " + i3.next() + " Price " +
					// i2.next()
					// + (System.getProperty("line.separator")));

					fw.write("  Item name : " + i3.next() + (System.getProperty("line.separator")));
					fw.write("  Price : " + i2.next() + (System.getProperty("line.separator")));
				}

			}
			fw.write("----------------------------------" + (System.getProperty("line.separator")));
			fw.write((System.getProperty("line.separator")));
			fw.write("Your total bill is : " + sum + (System.getProperty("line.separator")));
			Scanner sc = new Scanner(System.in);

			System.out.println("-------------------------------------------------------- ");
			System.out.println("");

			System.out.println("Enter the amount paid by customer ");
			Cashback = sc.nextInt();

			if (Cashback > sum) {
				fw.write("Customer Paid  : " + Cashback + (System.getProperty("line.separator")));
				Cashback = sum - Cashback;
				System.out.println("Give money back to customer :" + Cashback);
				fw.write("Cash Back money to customer  : " + Cashback + (System.getProperty("line.separator")));
				fw.write("----Thank you for Shopping-------");

			}

			else if (Cashback < sum) {
				// fw.write("Customer Paid : " + Cashback +
				// (System.getProperty("line.separator")));
				Cashback = sum - Cashback;
				System.out.println("Ask customer for more money :" + Cashback);
				moremoney = sc.nextInt();
				if (moremoney == Cashback) {
					// Cashback = Cashback + moremoney;
					// fw.write(" Customer Paid : " + Cashback +
					// (System.getProperty("line.separator")));
					System.out.println("Pending values  paid");
					fw.write("----Thank you for Shopping-------");
				} else if (moremoney > Cashback) {
					Cashback = moremoney - Cashback;
					System.out.println("Pay money to Customer " + Cashback);
					fw.write("Cash Back money to customer  : " + Cashback + (System.getProperty("line.separator")));
					fw.write("----Thank you for Shopping-------");

				} else {
					System.out.println("Donot procede for Billing ");
					fw.write("--Sorry please pay the right amount --");

				}

			} else if (Cashback == sum) {
				fw.write("Customer Paid  : " + Cashback + (System.getProperty("line.separator")));
				Cashback = sum - Cashback;
				System.out.println("No money to return   " + Cashback);
				fw.write("Cash Back money to customer  : " + Cashback + (System.getProperty("line.separator")));
				fw.write("Thank you for Shopping");
			}

			// System.out.println(Cashback);
			// Cashback = sum-Cashback;
			// System.out.println("Give money back to customer :" +Cashback);
			// fw.write("Cash Back money to customer : " +Cashback +
			// (System.getProperty("line.separator")));
			fw.flush();
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
