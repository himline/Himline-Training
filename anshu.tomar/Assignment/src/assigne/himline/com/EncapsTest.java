package assigne.himline.com;


	public class EncapsTest{
	    public static void main(String args[]){
	         EncapsulationDemo obj = new EncapsulationDemo();
	         obj.setEmpName("anshu");
	         obj.setEmpAge(24);
	         obj.setEmpSSN(112233);
	         System.out.println("Employee Name: " + obj.getEmpName());
	         System.out.println("Employee SSN: " + obj.getEmpSSN());
	         System.out.println("Employee Age: " + obj.getEmpAge());
	         System.out.println("BYE!");
	    } 
	
	}


