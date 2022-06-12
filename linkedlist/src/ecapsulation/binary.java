package ecapsulation;

import java.util.Scanner;

public class binary {
	
	 int binarySearch(int arr[],int n,int x) {
		int l=0;
		int h=n-1;
		
		while(l<=h) {
			int mid=(l+h)/2;
			
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid] < x) {
				l = mid+1;
			}else {
				h = mid-1;
			}
		}
		
		
		
		return -1;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int key = sc.nextInt();
		
int arr[] = new int[n];

for(int i=0;i<n;i++) {
	 arr[i]=sc.nextInt();
}
binary b = new binary();
int res = b.binarySearch(arr, n, key);

System.out.println(res);
	}

}
