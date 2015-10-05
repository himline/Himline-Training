package com.himline.overLoading;

public class OverLoadingclass {
	public int add(int a,int b){
		return(a+b);
	}
	public int add(int a,int b,int c){
		return(a+b+c);
	}
	
	public static void main(String[] args) {
	// TODO Auto-generated method stub
		OverLoadingclass olc = new OverLoadingclass();
		
			
		System.out.println(olc.add(1,2));
		System.out.println(olc.add(1,2,3));
		
	}

}
