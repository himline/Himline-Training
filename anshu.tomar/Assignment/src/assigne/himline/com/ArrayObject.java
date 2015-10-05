package assigne.himline.com;

public class ArrayObject {	

		  int salary = 1000;
		  public static void main(String args[])
		  {
		    Employee emp[] = new Employee[10];
		      System.out.println(emp[0].salary);  // throws NullPointerException
		 
		   for(int i = 0; i < emp.length; i++)
		   {
		     emp[i] = new Employee();
		     System.out.println(emp[i].salary);
		   }
		  }
		

	}


