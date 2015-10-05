package com.himline.Chapter_7;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueExample {
	public static void main(String[] args) {
		Comparator<String> com = new VowelComparator();
		PriorityQueue<String> prior = new PriorityQueue<String>(10 , com);
		prior.add("lemon");
		prior.add("orange");
		prior.add("fig");
		prior.add("Watermelon");
		while(prior.size() != 0){
			System.out.println(prior.remove());
		}
	}
	}

