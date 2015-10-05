package assigne.himline.com;

public class CharToDouble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d1 = 67.5; // 8 bytes 
//		char ch = double d1; // 8 bytes to 2 bytes
		char ch = (char)d1; // 8 bytes double is type casted to 2 bytes char 
		System.out.println(ch); // print c (ASCII value of C is 67)
		
	}

}
