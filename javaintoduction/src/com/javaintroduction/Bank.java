package com.javaintroduction;

public class Bank {
	static int serail=12342; //serail number will increments automatically 
	int accno;
	String name;
	int Balance;
	String mobile;
	{
		serail+=1;//auto increment when the object is created
		accno=serail;//assigning the accno to serail no
	}
	void display(){
		//System.out.println(serail);
		System.out.println(accno);
		System.out.println(name);
		System.out.println(Balance);
		System.out.println(mobile);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b1=new Bank();
		
		//b1.accno=serail;
		b1.name="siddhu";
		b1.Balance=10;
		b1.mobile="911107254256";
		b1.display();
		Bank b2=new Bank();
	
		//b2.accno=serail;
		b2.name="eswar";
		b2.Balance=0;
		b2.mobile="90307254256";
		b2.display();
		Bank b3=new Bank();
		
		//b3.accno=serail;
		b3.name="macha";
		b3.Balance=100;
		b3.mobile="91237254256";
		b3.display();
	}

}
