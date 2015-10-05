package Grossarystore;

import java.io.CharArrayWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.IntStream;

public class Grosaa {
	static char[] c = new char [100] ;
	
	public static void main(String args[]) throws IOException {
		HashMap<char[]  , Integer> hm = new HashMap ();
		Scanner sc = new Scanner(System.in);
		double [] price = new double [50];
		
		try {
			FileReader fr = new FileReader ("taskkk.txt");
			fr.read(c);
			 CharArrayWriter cawriter = new CharArrayWriter();
			 cawriter.write(c);
			
//				System.out.println(c);
			 	char [] ch  = cawriter.toCharArray();
			    String s1 = new String(ch, 0, ch.length); 
			    ArrayList[] str = new ArrayList [50];
			
			    System.out.println(s1);
			    Scanner scan = new Scanner (System.in);
			    for (int i = 0 ; i < price.length; i ++){
			    price[i] = scan.nextDouble();
			    System.out.println("     "   +price[i]  +"    "+ c[i]);
				int sum = IntStream.of((int) price[i]).sum();
			    System.out.println("The sum is " + sum);
				
				}
			    	
				
				
			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}


