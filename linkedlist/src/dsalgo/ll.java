package dsalgo;

import java.util.Scanner;

public class ll {
	 static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
		
	}
	static Node head;
	
	void insert(int x) {
		System.out.println(x+"  our no.");
		Node temp = new Node(x);
		temp.next = head;
		head = temp;
		
	}
	
	public void addlast(int x) {
		Node temp2 = new Node(x);
		if(head==null) {
			head=temp2;
			return;
		}
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		
		temp.next = temp2;
		 
	}
	
	
	void print() {
		Node temp =head;
		while(temp != null) {
			System.out.print(temp.data+ "  ");
			temp=temp.next;
		}
	}
	
	void dele(Node del) {
		Node temp= del.next;
		del.data = temp.data;
		del.next=temp.next;
		System.gc();
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ll list = new ll();
		head=null;
		System.out.println("enter values");
		for(int i=0;i<5;i++) {
			int x = sc.nextInt();
			list.addlast(x);
		}
		
		list.print();
		
		Node del = head.next.next;
		list.dele(del);
		
		list.print();
		
	
	}

}
