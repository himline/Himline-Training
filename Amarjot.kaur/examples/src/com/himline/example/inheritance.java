package com.himline.example;

public class inheritance {
	public static void main(String arg[]){
		AddSub obj = new AddSub();
		obj.num1 = 5;
		obj.num2 = 4;
		obj.sum();
		System.out.println(obj.result);
		obj.sub();
		System.out.println(obj.result);
	}

}
class Add{
	int num1,num2,result;
	public void sum()
	{
		result = num1 + num2;
	}
}
class AddSub extends Add{
	public void sub()
	{
		result = num1 - num2;
	
	}
}
class AddSubMul extends AddSub{
	public void multi(){
		result = num1 * num2 ;
	}
}