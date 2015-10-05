package com.himline.polymorphism.overloading;

public class OverloadingClass {

	//Different number of parameters
	public String paramNumber(){
		return "called with no parameter";
	}
	
	public String paramNumber(int x){
		return "called with one parameter";
	}
	public String paramNumber(int x, String y){
		return "called with two parameter";
	}
	
	
	//Different data type of parameters
	public String paramDataType(int x){
		return "called with one parameter of int type";
	}
	public String paramDataType(String y){
		return "called with one parameter of String type";
	}
	
	//Sequence of datatypes
	public String paramSeqType(int x, String y){
		return "called with one parameter of int and string type";
	}
	public String paramSeqType(String y, int x){
		return "called with one parameter of String and int  type";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingClass olc = new  OverloadingClass();
		
		System.out.println(olc.paramNumber());
		System.out.println(olc.paramNumber(1));
		System.out.println(olc.paramNumber(1,"s"));
		
		System.out.println(olc.paramDataType(1));
		System.out.println(olc.paramDataType("1"));
		
		System.out.println(olc.paramSeqType(1,"1"));
		System.out.println(olc.paramSeqType("1",1));
		

	}

}
