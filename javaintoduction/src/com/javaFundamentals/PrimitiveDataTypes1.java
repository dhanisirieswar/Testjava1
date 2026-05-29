package com.javaFundamentals;


//Primitive data types is used to store simple values into the memory

//1) Primitive Data Types:-byte,short,int,long,float,double,char,boolean

//Type casting:Coverting the one data type into another data Types
//Implicit Type-casting:-Converting the low data types values to the high data types values
//Explicit Type-Casting:-Converting the high data types values to the low data type values with same data type

public class PrimitiveDataTypes1 {
	
	//Byte is used to store the small whole number ,It range from -128 to 127;
	//if we give more than b values it stores compile-time error
	byte b=(byte)128; //Explicit Type-casting
	
	short s=b;//byte value is storing into int ,this process is called explicit type casting
	short s1=(short) 32768;//-32,768 to 32,767
	
	int i=s;//short value is storing into int,this process is called explicit type casting
	//int i1=(int)2147483648;//-2,147,483,648 to 2,147,483,647  it throws compile time error The literal 2147483648 of type int is out of range
	
	long l=i;//int value is storing into the long this type process is called explicit type casting
	long l1= 9223372036854775807L;//-9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
	
	float f=l;//long value is stroing into float ,this type is called explicit type casting
	float f1=(float)1.234545666;//up to 6-7 decimal digits)
	
	double d=f;
	double d1=(double)94959595955555550559585D;// (up to 15 decimal digits)
	
	char c='M'; //char is used to store the single character
	char c1=65; //char is used to store the int value that is ASCII code (0-255)
	char c2='\u0061';//char is used to store the unicode values
	
	boolean b3=true;//boolean is a primitive data type which is used to sat true or false 
	boolean b4=false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub`
		PrimitiveDataTypes1 p1=new PrimitiveDataTypes1();
		System.out.println("Byte is " + p1.b);
		System.out.println("Short is " + p1.s);
		System.out.println("Short is " + p1.s1);
		System.out.println("int  is " + p1.i);
		System.out.println("long  is " + p1.l);
		System.out.println("long  is " + p1.l1);
		System.out.println("float  is " + p1.f);
		System.out.println("float  is " + p1.f1);
		System.out.println("double  is " + p1.d);
		System.out.println("double  is " + p1.d1);
		System.out.println("char  is " + p1.c);
		System.out.println("char  is " + p1.c1);
		System.out.println("char  is " + p1.c2);
		System.out.println("boolean  is " + p1.b3);
		System.out.println("boolean  is " + p1.b4);
	
	}

}
