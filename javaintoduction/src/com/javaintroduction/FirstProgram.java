package com.javaintroduction;

public class FirstProgram {
	
	//static Block and Instance Block
	
	//Static block and static variable in these static variable will work first when it is in the order
	
	
	static {
		System.out.println("static blocked started");
		FirstProgram fp=new FirstProgram();//to acess the instance block we need to create the object 
		
	}
	static {
		System.out.println("s2");
		FirstProgram fp=new FirstProgram();
	}
	{
		
		System.out.println("Instance block started");
		
	}
	{
		System.out.println("Instance block started");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("main method started");
		
	}
	

}
