package dsalgo;

public class seclargest {
	public static void largest(int[] arr,int n) {
		int i,fir,sec;
		fir = sec = Integer.MIN_VALUE;
		
		for(i=0;i<n;i++) {
			if(arr[i]>fir) {
				sec = fir;
				fir=arr[i];
			}
			else if(arr[i]>sec && arr[i]!= fir) {
				sec =arr[i];
			}
		}
		System.out.println(sec);
	}
	
	
	
	public static void main(String[] args) {
		int arr[] = {12,35,1,10,34,1};
		int n = arr.length;
		largest(arr,n);
	}

}
