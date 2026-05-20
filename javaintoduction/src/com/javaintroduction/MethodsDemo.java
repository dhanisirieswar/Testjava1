package com.javaintroduction;

public class MethodsDemo {
//static Methods andInstance Methods
//to acess the static and instance methods we have to call the methods in main methods are else the instance methods
//We can call Static methods in instance methods
//we can call instance methods in instance methods
//we can call static methods in static methods
//we cannot call instance methods in Static methods
	
	
	void method1() {
		
		
		System.out.println("Main method1");
		
		
	}
	 void method2() {
		
		
		 System.out.println("Main method2");
		MethodsDemo md2=new MethodsDemo();
		 method3();
		
	 }
	 static void method3() {
		 
		 
		 System.out.println("Static method started");
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("in method started");
		MethodsDemo md=new MethodsDemo();
		md.method1();
		
	}

}
