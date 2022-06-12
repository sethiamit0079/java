package hello.demo;
import java.util.Scanner;

public class add {
	
	public static int addition(int a,int b) {
		int c = a+b;
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int c= addition(a,b);
		System.out.println(c);

	}

}
