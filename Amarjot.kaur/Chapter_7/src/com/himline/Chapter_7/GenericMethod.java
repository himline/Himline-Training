package com.himline.Chapter_7;

import java.util.ArrayList;
import java.util.List;

public class GenericMethod {
	public static void drawshapes(List<? extends GenericShape>lists){
			for(GenericShape s : lists){
				s.draw();				
			}
		}
	public static void main(String[] args) {
		ArrayList<Rectangle> list1 = new ArrayList<Rectangle>();
		list1.add(new Rectangle());
		list1.add(new Rectangle());
		list1.add(new Rectangle());
		ArrayList<circle> list2 = new ArrayList<circle>();
		list2.add(new circle());
		list2.add(new circle());
	
	drawshapes(list1);
	drawshapes(list2);
	}

}
