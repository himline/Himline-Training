package com.himline.polymorphism.overriding;

class Human{
	int legs =2;
	int arms =2;
	public String whoAmI(){
		return "Human";
	}
	
	// Modifier
	protected String myType(){
		return "Human Type";
	}
	
}


class Father extends Human{
	int children = 2;
	public String whoAmI(){
		return "OverridingClass";
	}
	// Modifier
	public String myType(){
		super.myType();
			return "Human Type";
	}
	
//	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Human human = new Father();
		//Human human2 = new Human(); 
		//Father father = new Human(); --- Not Possible
				
      System.out.println(human.whoAmI());
      System.out.println(human.myType());
	}

}
