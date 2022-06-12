package dsalgo;

import java.util.Scanner;

public class linkedlist {
	static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	static Node head;
	
	static void insert(int x ) {
		Node temp = new Node(x);
		temp.next=head;
		head=temp;
	}
	
	public void print() {
		Node temp=head;
		while(temp != null) {
			System.out.print(temp.data+ " ");
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		linkedlist list = new linkedlist();
		Scanner sc = new Scanner(System.in);
		head=null;
		
		
		System.out.println("how muxh no want to add ?");
		int n = sc.nextInt();
		
	  System.out.println("enter values");
	  for(int i=0;i<n;i++) {
		  int x = sc.nextInt();
		  list.insert(x);
	  }
		
		
		list.print();
		
	}

}
