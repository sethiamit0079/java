
package com.multithreading;

public class lambdaDemo {
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("good ");
	
	//anonymous class               //object sud be here but now we put the whole class in Thread(obj);
		Thread t1 = new Thread(() ->
		 {
		for(int i=0;i<=5;i++) {
			System.out.println("Hi");
			
try {   Thread.sleep(500); } catch (InterruptedException e) { }

		}
	});
		
		
		Thread t2 = new Thread(() -> {
			for(int i=0;i<=5;i++) {
				System.out.println("Hello");
try {  Thread.sleep(400); } catch (InterruptedException e) { }
			}
		});
		
		
		t1.start();
		t2.start();  //start always call run
		
		
		
	}

}


//Runnable is functional interface
