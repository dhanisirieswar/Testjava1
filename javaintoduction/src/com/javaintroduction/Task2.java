package com.javaintroduction;

public class Task2 {
	static String sname="amazon";
	int productId;
	String Productname;
	int price;
	void display() {
		System.out.println(sname);
		System.out.println(productId);
		System.out.println(Productname);
		System.out.println(price);
	}
	
	public static void main(String args[]) {
		
		Task2 t1 = new Task2();
		t1.productId=1;
		t1.Productname="dress";
		t1.price=1000;
		t1.display();
		Task2 t2 = new Task2();
		t2.productId=2;
		t2.Productname="groceries";
		t2.price=1234;
		t2.display();
		Task2 t3 = new Task2();
		t3.productId=3;
		t3.Productname="cars";
		t3.price=14434;
		t3.display();
		
		
		
	}
}
