package com.himlinestr;

public class Puppy{
	   
	   

	   private static final String puppyAge = null;

	public Puppy(String name){
	      // This constructor has one parameter, name.
	      System.out.println("Name chosen is :" + name ); 
	   }
	   
	   public void setAge( int age ){
	       int puppyAge = age;
	   }

	   public int getAge( ){
	       int puppyAge = 10;
		System.out.println("Puppy's age is :" + puppyAge ); 
	       return puppyAge;
	   }
	   
	   public static void main(String []args){
	      /* Object creation */
	      Puppy myPuppy = new Puppy( "tommy" );

	      /* Call class method to set puppy's age */
	      myPuppy.setAge( 2 );

	      /* Call another class method to get puppy's age */
	      myPuppy.getAge( );

	      /* You can access instance variable as follows as well */
	      System.out.println("Variable Value :" + myPuppy.puppyAge ); 
	   }
	}