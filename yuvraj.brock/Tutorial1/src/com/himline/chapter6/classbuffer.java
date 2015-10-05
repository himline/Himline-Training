package com.himline.chapter6;

public class classbuffer {
	public static void main(String[] args){
	StringBuffer sb = new StringBuffer("abc");
	sb.append("def");
	System.out.println("sb = " + sb);
	
	StringBuilder s = new StringBuilder("abc");
	s.append("def").reverse().insert(3, "---");
	System.out.println( s );
}
}