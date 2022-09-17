package com.equals;

public class hashandEquals {
	public static void main(String[] args) {
		
		//deep copy false
		Employee e1 = new Employee(1, "amit");
		
		Employee e2 = new Employee(1,"amit");
		
		System.out.println("double equal  " + (e1 == e2));
		
		System.out.println("euals to  "+(e1.equals(e2)));
		
		//shallow copy true
		Employee e3 = new Employee(1,"amit");
		Employee e4 = e3;
		
		System.out.println("double equal  " + (e3 == e4));
		
		System.out.println("euals to  "+(e3.equals(e4)));
		
		
	}

}
