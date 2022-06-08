package com.multithreading;

public class threadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("good ");
		
		hi obj1 = new hi();
		hello obj2 = new hello();
		
		obj1.start();
		obj2.start();  //start always call run
		
		
		
	}

}

class hi extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hi");
			
try {Thread.sleep(500); 
} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}
	}
}


class hello extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("Hello");
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
//
//class hello extends Thread{
//	public void show() throws InterruptedException {
//		for(int i=0;i<=5;i++) {
//			System.out.println("Hello");
//			Thread.sleep(500);
//		}
//	}
//}



//internally thread calls a run() method when we use obj.start();
