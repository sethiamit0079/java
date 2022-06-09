package com.multithreading;

public class runnableINterfaceDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("good ");
		
//		hii obj1 = new hii();
//		helloo obj2 = new helloo();
		
		Runnable obj1 = new hii();
		Runnable obj2 = new helloo();
		
		//Runnable -->  Thread --> run()
		Thread t1 = new Thread(obj1);
		Thread t2 = new Thread(obj2);
		
		
		t1.start();
		t2.start();  //start always call run
		
		
		
	}

}

class hii implements Runnable{
	
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


class helloo implements Runnable{
	
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



//Runnable interface -> functional interface
