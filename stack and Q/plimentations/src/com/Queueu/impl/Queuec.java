package com.Queueu.impl;

public class Queuec {
	
	static int arr[];
	int n;
	int front=-1;
	static int rear=-1;
	public Queuec(int n) {
		this.n = n;
		arr = new int[n];
	}
	
	void enqueue(int data) {
		if((rear+1)%n == front) {
			//full
			return;
		}
		if(front == -1) front=0;
		rear = (rear+1)%n;
		arr[rear] = data;
	}
	
	int dequeue() throws MyException {
	if(front == -1) {
		throw new MyException("underflow");
	}
	
	int result = arr[front];
	
	if(front == rear) {
		//last element
		front = rear = -1;
	}else {
		front = (front+1)%n;
	}
	return result;
	}
	
	
	static void print(){
		for(int i=0;i<=rear;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public static void main(String[] args) throws MyException {
		
		Queuec qc = new Queuec(5);
		
		qc.enqueue(1);
		qc.enqueue(2);
		qc.enqueue(3);
		qc.enqueue(4);
		qc.enqueue(5);
		
		
		print();
		
		qc.dequeue();
		
		print();
		
		
		
	}

}




class MyException extends Exception{
	public MyException(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
}
