package demo;

import java.util.Scanner;

public class fibonacci {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int temp=0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=3;i<=n;i++) {
			temp = a+b;
			a = b;
			b= temp;
		}
		System.out.println(temp);
		
	}

}
