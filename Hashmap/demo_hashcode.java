package com.demo;

import java.util.HashSet;

public class demo_hashcode {
	
	static class student{
		int roll;
		String name;
		public student(int roll, String name) {
			this.roll = roll;
			this.name = name;
		}
		
		public String toString() {
			return name+" "+roll;
		}
		
		@Override
		public int hashCode() {
			return roll;
		}
		
		public boolean equals(Object obj) {
			student that = (student)obj;
			if(this.roll == that.roll) {
				return true;
			}
			return false;
		}
	}
	
	public static void main(String[] args) {
		
		
		student s1 = new student(1,"amit");
		student s2 = new student(1,"amit");
		student s3 = new student(2,"naveen");
		student s4 = new student(3,"bharat");
		student s5 = new student(4,"deepak");
		
		
		
		HashSet<student> st= new HashSet<student>();
		st.add(s1);
		st.add(s2);
		st.add(s3);
		st.add(s4);
		st.add(s5);
		
		
		System.out.println(st);
		
		
		
	}

}
