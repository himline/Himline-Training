package chapter7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

public class Hashtablesample {

	public static void main(String[] args) throws IOException {

		// Create Hashmap
		// map 1

		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("key1", "map1");
		hm.put("key2", "map1");
		System.out.println("Map value===>" + hm);

		// map 2
		HashMap<String, String> hm2 = new HashMap<String, String>();
		hm2.put("key3", "map2");
		hm2.put("key4", "map2");
		hm2.putAll(hm);

		// File to write Hash map
		File myOutputFile = new File("/temp/hash.txt");
		@SuppressWarnings("unused")
		boolean isNewFileCreated = myOutputFile.createNewFile();
		FileWriter fw = new FileWriter(myOutputFile);

		// Reading / Writting Hashmap
		Collection<String> c = hm.values();
		Collection<String> ck = hm.keySet();
		Collection<String> coo = hm2.keySet();
		// obtain an Iterator for Collection
		Iterator<String> itr = c.iterator();
		Iterator<String> itrk = ck.iterator();
		Iterator<String> cool = coo.iterator();
		// iterate through HashMap values iterator
		while (itr.hasNext())
			fw.write("Hashvalue = " + itr.next() + "\n");
		while (itrk.hasNext())
			fw.write("key = " + itrk.next() + "\n");
		while (cool.hasNext())
			fw.write("Hash 2 value = " + cool.next() + "\n");
		fw.close();

	}
}
/*
 * 
 * }
 * 
 * System.out.println("Map2 value===>" + hm2);
 * 
 * // table 1
 * 
 * Hashtable<String, String> ht = new Hashtable<String, String>();
 * ht.put("yuvraj", "arora"); ht.put("amarjot", "kaur");
 * 
 * // adding map values to table ? when if condition is true if (ht.size() > 5
 * && hm.containsValue("map1")) { System.out.println("IS MAP KEY EXIST ===> " +
 * ht.containsKey("key1")); ht.putAll(hm); System.out.println(
 * "IS MAP KEY EXIST ===>  " + ht.containsKey("key1")); } else if (hm2.size() >
 * ht.size()) { ht.putAll(hm2); System.out.println(
 * "NEW VALUE OF HASH TABLLE====>" + ht); } else { ht.put("if condition",
 * "not true"); System.out.println(ht); ht.remove("if condition"); }
 * 
 * // replace function ht.replace("yuvraj", "arora", "kaur");
 * System.out.println("HASHTABLE AFTER REPLACEMENT===>" + ht);
 * 
 * // getting value ht.get("amarjot"); System.out.println(ht.get("amarjot"));
 * 
 * // to store the map and table values in file try { boolean isNewFileExist =
 * false; Hashtablesample htc = new Hashtablesample(); File myHashOutputFile =
 * new File("hash.txt"); isNewFileExist = myHashOutputFile.createNewFile();
 * FileWriter fw = new FileWriter(myHashOutputFile); fw.write("hm");
 * fw.equals(htc); System.out.println(myHashOutputFile.exists());
 * 
 * } catch (IOException e) {
 * 
 * e.printStackTrace(); }
 * 
 * // manual search for map and table // type - tab for table // type- map for
 * maps
 * 
 * @SuppressWarnings("resource") Scanner scan = new Scanner(System.in);
 * System.out.println("Enter keyword: "); String userinput = scan.nextLine(); if
 * (userinput.equals("map")) { System.out.println(hm2); } else if
 * (userinput.equals("tab")) { System.out.println(ht); } else {
 * System.out.println("ENTER CORRECT KEYWORD:"); } } }
 * 
 */