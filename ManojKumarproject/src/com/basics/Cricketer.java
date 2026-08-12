package com.basics;

public class Cricketer {
	static int countryID=91;
	static String countryName="India";
	int jerseyNumber;
	String cricketerName;
public static void main(String[] args) {
	System.out.println("main method started");
	System.out.println("Welcome to Indian Crcket Team!");
	System.out.println("***Object1 info***");
	Cricketer c1=new Cricketer();
	
	c1.jerseyNumber=7;
    c1.cricketerName="MS Dhoni";
    System.out.println("Country ID:"+countryID);
    System.out.println("Country Name is:"+countryName);
    System.out.println("Jersey Number is:"+c1.jerseyNumber);
    System.out.println("Cricketer Name is:"+c1.cricketerName);
    countryID=90;
	countryName="bharath";
    
    System.out.println("***Object2 info***");
	Cricketer c2=new Cricketer();
	
	
    System.out.println("Country ID:"+countryID);
    System.out.println("Country Name is:"+countryName);
    System.out.println("Jersey Number is:"+c2.jerseyNumber);
    System.out.println("Cricketer Name is:"+c2.cricketerName);
    
    System.out.println("***Object3 info***");
	
	System.out.println("Country ID:"+countryID);
    System.out.println("Country Name is:"+countryName);
    Cricketer c3=new Cricketer();
	c3.jerseyNumber=18;
    c3.cricketerName="Virat";
    
    System.out.println("Jersey Number is:"+c3.jerseyNumber);
    System.out.println("Cricketer Name is:"+c3.cricketerName);
    
System.out.println("***Object4 info***");
	
	System.out.println("Country ID:"+countryID);
    System.out.println("Country Name is:"+countryName);
    Cricketer c4=new Cricketer();
    c3.jerseyNumber=1;
    c3.cricketerName="Rahul";
    System.out.println("Jersey Number is:"+c3.jerseyNumber);
    System.out.println("Cricketer Name is:"+c3.cricketerName);
    
    System.out.println("Jersey Number is:"+c4.jerseyNumber);
    System.out.println("Cricketer Name is:"+c4.cricketerName);




}
}
