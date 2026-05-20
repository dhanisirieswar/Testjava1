package com.javaintroduction;

//Garbage means, removing of unused or unreferenced object
//JVM will automatically call the garbage System.gc();
class Student {
	int id;
	String name="eswar";
	Student friend;
	
	protected void finalize() throws Throwable {
	   System.out.println("Finalize"); // JVM calls this automatically before GC removes the object
	}
	void Vcube(){
		Student s5=new Student();
		System.out.println("Vcube");
		
	}
}

public class Garbage {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Main method startedd");
		Student s1=new Student();
		System.out.println(s1);//this statement will print object address with hexa decimal value hash code
		int a =0x1dbd16a6;
		System.out.println(a);//498931366 this is the hash code for the above statement
		//creating another Statement
		Student s2=new Student();
		System.out.println(s2);//this  statement will print object address with hexa decimal value hash code
		int b=0x7ad041f3;
		System.out.println(b);
		System.out.println("Main method ended!");
		
		//There are the various steps to remove the garbage values clearly.In java there are 5 ways
				//1)Nullifying the objects
				//2)Re-assigning the objects
				//3)Anonymous objects
				//4)Object inside the methods
				//5)Island of Isolations
				
		//1)Nullifying the objects
			//s1=null;
		
		//########################################//
		//2)Reassigning the object
			Student s3=new Student();
			Student s4=new Student();
			
			s4=s3;
			System.out.print(s4);
			//3)Anonymous of an Object
			System.out.println(new Student().name);
			//4)methods inside the object
			Student s6 = new Student();   // create object first
	        s6.Vcube();
	        //5)Island of Isolation
	        Student s7=new Student();
	        Student s8=new Student();
	        s8.friend=s7;
	        s7.friend=s8;
	        s7=null;
	        s8=null;
	        
		System.gc();//System is the predefined class from java.lang package .gc() is the method which is used for the garbage collection
		Thread.sleep(2000);//we are giving time to remove the gc so it takes time and runs the errror
		
		}

}
