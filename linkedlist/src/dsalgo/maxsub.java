package dsalgo;

public class maxsub {
	
	public static int max(int[] arr) {
		
		int sum=arr[0];
		int curr=0;
		
		for(int i=0;i<arr.length;i++) {
			curr+=arr[i];
			if(curr<0)curr=0;
			if(curr > sum) sum=curr;
			
		}
	
	return sum;	
	}
	
	public static void main(String[] args) {
		int[] arr = {1,-2,3,-1,2};
		int x = maxsub.max(arr);
		
		System.out.println(x);
		
	}

}
