package com.lamdademo;

public class lamda {
	public static void main(String[] args) {
		System.out.println("helo");
	
// 0  normal impl
		myinter myin = new myinterimp();
		myin.sayhello();
		
		
		
		// 1 ANOUNYMOUS CLASS
		
//		myinter in = new myinter() {
//			@Override
//			public void sayhello() {
//				// TODO Auto-generated method stub
//				System.out.println("anonymous impl");
//			}
//		};
//		
//		myinter in2 = new myinter() {
//			
//			@Override
//			public void sayhello() {
//				// TODO Auto-generated method stub
//			System.out.println("second impl");	
//			}
//		};
//		
//		
	
	
		//using our interface by lamda 
		
	myinter i = () -> {
		System.out.println("first time lamda");
	};
	
	i.sayhello();
		
		
	myinter i1 = () -> System.out.println("second lambda");
		
		i1.sayhello();
	
	}

}
