package com.multithreading;

public class stockThreadDemo {
	public static void main(String[] args) {
		System.out.println("good ");
		
		Runnable b = new buy();
		Runnable s = new sell();
		
		Thread t1 = new Thread(b);
		Thread t2 = new Thread(s);
		
		t1.start();
		t2.start();
		
		
	}

}

class buy implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
		System.out.println("buy");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}


class sell implements Runnable{
	public void run() {
		for(int i=0;i<=5;i++) {
			System.out.println("sell");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
			}
	}