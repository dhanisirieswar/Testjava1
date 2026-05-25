package com.javaFundamentals;//Package is a folder to maintain class interfaces together in  one place

//keywords means ,in java the keywords are reserved words having the pre-defined meaning

import java.util.Scanner; //Import is a keywords can helps import classes from one package to another
public class KeyWords {

	void var() {// var is keyword which introduced in java 11 it can used in inside the methods and blocks to maintain in one generic type
		var age=22;
		var name="eswar";
		var height=5.4;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1)Prinmitive data types
		byte a=10; //A byte is a primitive data type in Java that stores a small integer value. 8 bits->1 bytes
		System.out.println(a);
		int b=10;
		System.out.println(b);// A basic data type that stores a whole number (no decimals). 16bits->2 bytes
		long c=1000000000000000L; //A basic primitive data type which stores a long integere value-> 32bits->4 bytes
		System.out.println(c);
		float d=1.3f;//Stores decimal numbers with single precision (less accurate).
		System.out.println(d);
		double e=1.532434; //Stores decimal numbers with double precision (more accurate).
		System.out.println(e);
		char ch='M';//Stores a single character using Unicode.
		System.out.println(ch);
		boolean isJavaissecure=true;
		System.out.println(isJavaissecure);
		short s=10; //A short is a primitive data type that stores a whole number, larger than byte but smaller than int.
		System.out.println(s);
		enum Day{
			Monday,Tuesday,Wednesday,Thursday,Friday,Saturday//An enum (enumeration) is a special data type that defines a fixed set of constants — values that never change.
		}
		Day today = Day.Monday;
		System.out.println(today);
		
		
		String shh = "Hello";//instanceof is a keyword that checks whether an object belongs to a particular class or interface — it returns true or false.
		
		System.out.println(shh instanceof String);   // true

		int[] arr = new int[5];//instanceof is a keyword that checks whether an object belongs to a particular class or interface — it returns true or false.
		
		System.out.println(arr instanceof int[]); // true
		 int ages=15;//assert is a keyword used for testing assumptions in your code during development — it checks if a condition is true, and if not, throws an error immediately.
		assert ages>=10;
		System.out.println(ages);
	}

}
