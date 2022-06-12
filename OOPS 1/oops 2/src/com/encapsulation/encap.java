package com.encapsulation;

public class encap {
	public static void main(String[] args) {
	secret obj = new secret();
	obj.setData(103);
	obj.setData(400);
	System.out.println(obj.getData());
	}

}


class secret{
	private int data;
	
	public void setData(int data) {
		if(data>100) {
		this.data = data;
		}
	}
	
	public int getData() {
		return data;
	}
}