package com.lamdademo;

public class lamda {
	public static void main(String[] args) {
		System.out.println("helo");
		
		myinter in = new myinter() {
			@Override
			public void sayhello() {
				// TODO Auto-generated method stub
				System.out.println("anonymous impl");
			}
		};
		
		myinter in2 = new myinter() {
			
			@Override
			public void sayhello() {
				// TODO Auto-generated method stub
			System.out.println("second impl");	
			}
		};
		
		
		
		
		
		in.sayhello();
		in2.sayhello();
	}

}
