package com.stackimpl;

public class Stack {
	
	 int top;
	 int capacity;
	int a[];
	Stack(int capacity) {
		this.capacity = capacity;
		a=new int[capacity];
		top = -1;
	}
	
	int pop() throws MyException {
		if(top == -1) {
			throw new MyException("underflow");
		}
		int data = a[top];
		top--;
		return data;
	}
	
	boolean push(int data) throws MyException {
		if(top >=capacity) {
			throw new MyException("overflow");
		}
		top++;
		a[top] = data;
		return true;
	}
	
	
	public static void main(String[] args) throws MyException {
		
		Stack s = new Stack(10);
		
		s.push(1);
		s.push(2);
		s.push(3);
		s.push(4);
		s.push(5);
		s.push(6);
		s.push(7);
		s.push(8);
		s.push(1);
		s.push(2);
	
		
		
		
		
		
		System.out.println(s.top+"   "+s.capacity);
		
		
		
		
	}

}

class MyException extends Exception{
	public MyException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
}





/*
        6
[ ]     5
[ ]    3
[ ]   2
[ ]   1
[ ]   0 top
       -1 
       pop()
       push()
       

*/