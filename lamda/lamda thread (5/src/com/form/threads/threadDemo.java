package com.form.threads;

public class threadDemo {
	public static void main(String[] args) {
		
		

		//first thread jon
		//thread impl
		Runnable thread1 = () -> {
			//body of thred 
			for(int i=1;i<=10;i++) {
				System.out.println(i+ " ");
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
	//thread ref passed	
	 Thread t = new Thread(thread1);
	 t.setName("john");
	 t.start();
	 
	 
	 
		
	}

}
