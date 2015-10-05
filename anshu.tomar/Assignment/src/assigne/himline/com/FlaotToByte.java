package assigne.himline.com;

public class FlaotToByte {

	public static void main(String Args[]){
		
		float f1 = 20.5f; // float is 4 bytes
//		byte b1 = float f1  // error as 4 bytes to 1 bytes
    	byte b1 = (byte)f1;  // 4 byte type casted to 1 bye 
		System.out.println(b1); // print 20
		
	}
}
