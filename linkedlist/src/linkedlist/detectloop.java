package linkedlist;



public class detectloop {
	
	 class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next=null;
		}
	}
	static Node head;
	
	void insert(int x) {
		Node temp = new Node(x);
		
		if(head == null) {
			head = temp;
			return;
		}
		
		temp.next = head;
		head = temp;
		
	}
	
	void print() {
		Node temp=head;
		while(temp!= null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public boolean loop() {
		
		if(head == null || head.next ==null) {
			return false;
		}
		
		Node slow = head;
		Node fast=head;
		
		while(fast.next != null && fast.next.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			
			if(fast == slow) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public void addloop() {
		Node temp=head;
		Node temp2=head;
		while(temp.next!= null) {
			temp = temp.next;
		}
		temp.next=temp2.next.next;
	}
	
	public static void main(String[] args) {
		head=null;
		detectloop d1 = new detectloop();
		d1.insert(5);
		d1.insert(4);
		d1.insert(3);
		d1.insert(2);
		d1.insert(1);
		
		d1.print();
		
		d1.addloop();
		
		System.out.println(d1.loop());
	}
	
	
	

}
