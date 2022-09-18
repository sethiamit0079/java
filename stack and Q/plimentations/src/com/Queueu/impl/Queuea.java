package com.Queueu.impl;

public class Queuea {
	
	//   [ ,  ,  ,  ,  ]
	//            r  
	 
	static int[] arr;
	int capacity;
	static int rear;
	
	Queuea(int capacity){
		this.capacity = capacity;
		arr = new int[capacity];
		rear = -1;
	}
	
	void enqueue(int data){
		if(rear == capacity -1) {
			return;
		}
		
		rear++;
		arr[rear] = data;
	}
	
	int dequeue() throws MyException {
		if(rear == -1) {
		throw new MyException("underflow");
		}
		
		int x = arr[0];
		for(int i=0;i<rear;i++) {
			arr[i] = arr[i+1];
		}
		rear--;
		return x;
	}
	
	static void print(){
		for(int i=0;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) throws MyException {
		
		Queuea q = new Queuea(10);
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.enqueue(4);
		
		print();
		
		System.out.println(q.dequeue());
		
	}

}




class MyException extends Exception{
	public MyException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
}
