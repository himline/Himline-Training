package cm.himline.test;

public class New {

	

	import java.io.BufferedReader;
	import java.io.File;
	import java.io.FileReader;
	import java.io.IOException;
	import java.util.*;

	public class New {

		public static void main(String[] args) throws IOException {
			BufferedReader grocerry = new BufferedReader(new FileReader("list rup.txt"));
			String str;

			List<String> list = new ArrayList<String>();
			while ((str = grocerry.readLine()) != null) {
				list.add(str);

			}
			for (int i = 0; i < list.size(); i++) {
				System.out.println("value at :" + i + "=   " + list.get(i));

			}
			
			
			////**************************************************************
			
			
			ArrayList<Integer> arrl = new ArrayList<Integer>();
	        //adding elements to the end
	        arrl.add(50);
	        arrl.add(69);
	        arrl.add(4000);
	        arrl.add(40);
	        arrl.add(3000);
	        arrl.add(1000);
	        arrl.add(1500);
	        for (int i = 0; i < list.size(); i++) {
				System.out.println("value at :" + i + "=   " + list.get(i));
				
	        

	}
	}
	}


