package com.himline.example;

import java.util.Arrays;
public class ArrayBinarySearch {
	public static void main(String a[]){
        char[] chrArr = {'a','c','d','y','e','q','b'};
        int index = Arrays.binarySearch(chrArr, 0, chrArr.length-1, 'e');
        System.out.println("Char 'e' index is: "+index);
    }
}
