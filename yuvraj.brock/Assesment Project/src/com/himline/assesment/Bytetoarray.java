package com.himline.assesment;

public class Bytetoarray {
    public static void convertByteArrayToString() {
    	 
        byte[] byteArray = new byte[] {79,73, 67,69};
        String value = new String(byteArray);
       System.out.println(value);
 
    }
 
    public static void main(String[] args) {
    	Bytetoarray.convertByteArrayToString();
    }
 

}
