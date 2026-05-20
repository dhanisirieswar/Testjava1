package com.javaintroduction;

public class ObjectCount {
 static int count=0;
  {
	 count++;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectCount ob=new ObjectCount();
		ObjectCount ob1=new ObjectCount();
		ObjectCount ob2=new ObjectCount();
		System.out.print(count);
	}

}
