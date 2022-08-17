package com.sorting2;

public class linkedlist {
	
	static class Node{
		int data;
		Node next;
		Node(int data){
		this.data = data;
		this.next=null;
		}
	}
	
	static Node head;
	static Node head2;
	
	static void print() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data+"  ");
			temp = temp.next;
		}
		System.out.println();
	}
	
	
	static void insert(int data) {
		Node temp = new Node(data);
		if(head == null) {
			head = temp;
			return;
		}
		temp.next = head;
		head = temp;
		
	}
	
	static void duplicate() {
		Node temp = head;
		if(temp == null) {
			return;
		}
		while(temp.next != null) {
			
			if(temp.data == temp.next.data) {
				temp.next = temp.next.next;
			}else {
			temp = temp.next;
			}
		}
	}
	
	static void sorting2(int size) {
		if(size>1) {
			for(int i=0;i<size;i++) {
				Node curr = head;
				Node front = head.next;
				for(int j=0;j<size-1-i;j++) {
					if(curr.data > front.data ) {
						int temp = curr.data;
						curr.data = front.data;
						front.data = temp;
					}
					curr = curr.next;
					front=front.next;
				}
			}
		}
	}
	
	
	static int length(Node temp) {
		int count=0;
		while(temp!=null) {
			count++;
			temp= temp.next;
		}
		return count;
	}
	
	static Node intersect() {
		
		int count1 = length(head);
		int count2 = length(head2);
		
		Node temp3 = head;
		Node temp4 = head2;
		while(count1 > count2) {
			head=head.next;
			count1--;
		}
		while(count2 > count1) {
			head2=head2.next;
			count2--;
		}
		
		
		while(head.data != head2.data) {
			head=head.next;
			head2=head2.next;
		}
		return head;
		
	}
	
	static boolean palindrome() {
		
		Node slow=head;
		Node fast=head;
		
		while(fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		if(fast != null) {
			slow = slow.next;
		}
		
		slow =  reverse(slow);
		fast = head;
		
		while(slow!= null) {
			if(slow.data != fast.data) {
				return false;
			}
			slow = slow.next;
			fast = fast.next;
		}
		
		return true;
	}
	
	static Node reverse(Node curr) {
	Node prev = null;
	while(curr != null) {
		Node next = curr.next;
		curr.next = prev;
		prev=curr;
		curr = next;
	}
	return prev;	
	}
	
	public static void main(String[] args) {
		head = null;
		head2=null;
		
		insert(1);
		insert(2);
		insert(2);
		insert(1);
		
		
		Node temp = head;
		int size=0;
		while(temp!= null) {
			size++;
			temp = temp.next;
		}
		
		
		print();
		//duplicate();
		//sorting2(size);
		System.out.println(palindrome());
		//print();
		
	}

}
