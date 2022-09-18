package com.stackimpl;



class Node{
	int data;
	Node next;
	Node(int data) {
		this.data = data;
		this.next = null;
	}
	
}

public class Stackll {
	
	static Node head;
	int size;
	Stackll(){
		head = null;
		size=0;
	}
	void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
	
	int  pop() {
		int x = head.data;
		head = head.next;
	return x;	
	}
	
	static void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	
	public static void main(String[] args) {
		
		Stackll ss =new Stackll();
		
		ss.push(1);
		ss.push(2);
		ss.push(3);
		
		ss.print();
		
		System.out.println(ss.pop());
		
		
		
	}

}
