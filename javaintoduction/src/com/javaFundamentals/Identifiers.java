package com.javaFundamentals; //1,2

//Identifiers  means    name
//In java ,name means class name,package name,method name,variable,interface

//Rules of the identifiers
//1)Identifiers can have "A-Z" and "a-z" letters and 0-9digits;
//2)Identifiers  cannot have Special character except "_"  and "$".AND we can start with  that special Character
//3)Identifiers  cannot  start with KeyWords
//4)Identifier cannot  start with digits
//5)Identifiers cannot allows the spaces 
public class Identifiers {//3

	int id=1;//4
	String name="eswar";//5 //6
	char gender='M';//7
	
	void display() {//8
		System.out.println(id);
		System.out.println(name);
		System.out.println(gender);
	}
	public static void main(String[] args) {//9 //10
		// TODO Auto-generated method stub
			System.out.println("Main method Started!");//11 //12 //13
			Identifiers I1=new Identifiers();
			I1.display();//14
			System.out.println("Main method ended!");
		}

}
