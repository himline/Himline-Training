package com.himline.assesment;

public class Largestarray {

	public static void main(String[] args) {
		int arr[] = {15,15,16,3,5,1,45,2};
		int largest = arr[0];
		int smallest = arr[0];
		for(int i = 1 ; i < arr.length ; i ++){
			if(arr[i] > largest ){
				largest = arr[i];
			
			}
			else if(largest > arr[i] ){
				smallest = arr[i];
				
			}
			
		}
		System.out.println("largest no in array "+largest  + "index  " );
		System.out.println("smallest no in array "+smallest  + "index  ");
	}

}
