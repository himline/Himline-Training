package com.himline.Chapter_7;

import java.util.HashMap;
import java.util.Map;

enum Pets {
	DOG, CAT, HORSE
}

public class TestMap {
	public void main(String[] args) {
		Map<Object, Object> m = new HashMap<Object, Object>();
		m.put("k1", new DogMap("aiko")); 
		m.put("k2", Pets.DOG);
		m.put(Pets.CAT, "CAT key");
		DogMap d1 = new DogMap("clover"); 
		m.put(d1, "Dog key");
		m.put(new CapMap(), "Cat key");
		System.out.println(m.get("k1")); 
		String k2 = "k2";
		System.out.println(m.get(k2)); 
		Pets p = Pets.CAT;
		System.out.println(m.get(p)); 
		System.out.println(m.get(d1)); 
		System.out.println(m.get(new CapMap())); 
		System.out.println(m.size());
	}

}
