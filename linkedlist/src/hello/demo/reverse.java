package hello.demo;
import java.util.Scanner;
public class reverse {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[6];
		for(int i=0;i<6;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0;i<6/2;i++) {
			int temp = arr[i];
			arr[i] = arr[6-i-1];
			arr[6-i-1]=temp;
		}
		for(int i=0;i<6;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
