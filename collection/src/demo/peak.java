package demo;

public class peak {
	public static void main(String[] args) {
		int arr[] = {0,2,1,0};
		int n = arr.length;
		int max = arr[0];
		int j=0;
		for(int i=1;i<n-1;i++) {
			if(arr[i]>max) {
				max = arr[i];
				j=i;
			}
		}
		System.out.println(j);
	}

}
