package com.Queueu.impl;


class node{
	int data;
	node next;
	node(int data){
		this.data=data;
		this.next = null;
	}
}

//       [a,b]      [c,d]
//         h          r        t

public class Queuell {
	
	static node head;
	node rear;
	
	void add(int data) {
		node temp = new node(data);
		if(head == null) {
			head = temp;
			rear = temp;
			return;
		}
		rear.next = temp;
		rear = temp;
		
	}
	
	int poll() {
		int x = head.data;
		head = head.next;
		return x;
	}
	
	static void print() {
		node temp = head;
		while(temp != null) {
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Queuell qu = new Queuell();
		
		qu.add(1);
		qu.add(2);
		qu.add(3);
		qu.add(4);
		
		print();
		
		System.out.println(qu.poll());
	}

}






