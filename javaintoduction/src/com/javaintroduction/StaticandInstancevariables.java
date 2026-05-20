package com.javaintroduction;

public class StaticandInstancevariables {
	//static Variables and Instance Variables
	 // creating the instance variable

    String name;
    int rollno;
    int age;
    int gender;

    //creating the static variable

     static String college;
     static String location;
    public static void main(String args[]){
    	StaticandInstancevariables s = new StaticandInstancevariables();//to acess the instance variable we need to create the object
        System.out.println(s.name);
        System.out.println(s.rollno);
        System.out.println(s.age);
        System.out.println(college);
        System.out.println(location);

        StaticandInstancevariables s1=new StaticandInstancevariables();
        s1.name="Eswar";
        s1.rollno=12;
        s1.age=22;
        s1.college="lbrce";//once we assign the value to the static variable it will be same for all the objects until we change it
        s1.location="mylavaram";
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s1.age);
        System.out.println(college);
        System.out.println(location);

        StaticandInstancevariables s2=new StaticandInstancevariables();
        s2.name="gayathri";
        s2.rollno=13;
        s2.age=21;
         System.out.println(s2.name);
        System.out.println(s2.rollno);
        System.out.println(s2.age);
        System.out.println(college);
        System.out.println(location);

        StaticandInstancevariables s3=new StaticandInstancevariables();
        college="KLU";
        location="Hyderebad";

        System.out.println(s3.name);
        System.out.println(s3.rollno);
        System.out.println(s3.age);
        System.out.println(college);
        System.out.println(location);
    }
}
