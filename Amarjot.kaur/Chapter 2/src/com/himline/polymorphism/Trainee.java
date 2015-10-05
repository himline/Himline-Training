package com.himline.polymorphism;

public class Trainee extends Employee
{
   private Salary salary; //Annual salary
   public Trainee(String name, String address, Salary
      salary)
   {
       super(name, address,salary);
       
   }
   public void mailCheck()
   {
       System.out.println("Within mailCheck of Salary class ");
       System.out.println("Mailing check to " + getName() + " with salary " + salary);
   }
   public Salary getSalary()
   {
       return salary;
   }
   public void setSalary(Salary newSalary)
   {
       if(newSalary.getPay() >= 0.0){
       
          salary = newSalary;
       }
   }
   public int computePay(Salary salary)
   {
      System.out.println("Computing salary pay for " + getName());
      return salary.getPay()/52;
   }
}