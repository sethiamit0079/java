package generics;

public class insertionsort {
	public static void main(String[] args) {
		System.out.println("hello ");
		int arr[]= {5,4,10,1,6,2};
		int n = arr.length;;
		
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=temp;
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+ " ");
		}
	}
}
