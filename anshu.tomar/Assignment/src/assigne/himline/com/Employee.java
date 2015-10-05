package assigne.himline.com;

public class Employee {



  int salary;
  public static void main(String args[])
  {
    Employee o1 = new Employee();
    Employee o2 = new Employee();
 
    o1.salary = 5000;
    o2.salary = 6000;
 
    System.out.println("Salary of o1 before initially Rs." + o1.salary);// 5000
    System.out.println("Salary of o2 before initially Rs." + o2.salary);// 6000
 
    o1.salary = 7000;
    System.out.println("Salary of o1 after changing o1 Rs.:" + o1.salary);// 7000
    System.out.println("Salary of o2 after changing o1 Rs." + o2.salary);// 6000
 
    o2.salary = 8000;
    System.out.println("Salary of o1 after changing o2 Rs.:" + o1.salary);// 7000
    System.out.println("Salary of o2 after changing o2 Rs." + o2.salary);// 8000
  }
}

