package assigne.himline.com;

public class ArrayTest {

	public static void main(String[] args) {
		int  marks[] = new int[5];
			
		    System.out.println("Elements are " + marks.length);            
		              
					//  assign values
		    marks[0] = 4;
		    marks[1] = 5;
		    marks[2] = 710;
		    marks[3] = 801;
		    marks[4] = 901;
		 
		    System.out.println("Value of 4th element: " + marks[3]); 
		    
		 
		    System.out.println("Print the values in a single row");
		    for(int i = 0; i < marks.length; i++)
		    {

		   System.out.print(marks[i] + "\t");  
		    }
	}
	}

