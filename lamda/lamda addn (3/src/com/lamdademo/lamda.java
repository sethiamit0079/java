package com.lamdademo;

public class lamda {
	public static void main(String[] args) {
		System.out.println("helo");
	
// 0  normal impl
		//myinter myin = new myinterimp();
	//	myin.sayhello();
		
		
		
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
		
//	myinter i = () -> {
//		System.out.println("first time lamda");
//	};
//	
//	i.sayhello();
//		
//		
//	myinter i1 = () -> System.out.println("second lambda");
//		
//		i1.sayhello();
		
		
		//normal addition
		addinter i = new addimpl();
	
		int x = i.addition(2, 3);
		
		System.out.println(x);
		
		
		//anonymous class impl
		addinter in = new addinter() {
			
			@Override
			public int addition(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}
		};
		int y = in.addition(4, 5);
		System.out.println(y);
		
		
		//lambda impl
		addinter im = (int a, int b)->{
			return a+b;
		};
		int z = im.addition(9, 10);
		System.out.println(z);
		//lambda2 impl
//remove {} if single line, remove return variable, remove int variable - it will see in interface for int or string or else?.		
		addinter im2 = (a,b)-> a+b;
		int z2 = im2.addition(2, 6);
		System.out.println(z2);
		
	}

}
