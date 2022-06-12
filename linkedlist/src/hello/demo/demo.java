package hello.demo;

import java.util.Scanner;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m,n;
		boolean flag=false;
		System.out.println("enter no.");
		n = sc.nextInt();
		System.out.println("enter no to searched");
		m= sc.nextInt();
		int arr[] = new int[n];
		System.out.println("enter arrays");
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i] == m) {
				flag=true;
			}
		}
		
		if(flag == true) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
		

	}

}
