package demo;

import java.util.Scanner;

public class sqroot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
	
		int l=1;
		int h = n;
		int res=0;
		
		while(l<=h) {
			
			int mid = l+(h-l)/2;
			
			if(mid*mid <= n) {
				res = mid;
				l=mid+1;
			}else {
				h = mid-1;
			}
		}
		
		System.out.println(res);
	}

}
