package hello.demo;
import java.util.Scanner;

public class max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[5];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		System.out.println("enter array");
		for(int i=0;i<5;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<min) {
				min=arr[i];
			}
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		
		System.out.println("min * max"+min+" "+max);
		
		
	}

}
