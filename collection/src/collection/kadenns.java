package collection;

public class kadenns {
	
	int maxSubarray(int[] arr) {
		int n = arr.length;
		int k=7;
		int max = 0;
		int currmax0 = 0;
		
		
		while(k>0) {
			
		for(int i=0;i<n;i++) {
			
			currmax0 = currmax0 +arr[i];
			if(currmax0>max) {
				max = currmax0;
			}
			if(currmax0 <0) {
				currmax0 = 0;
			}
			
		}
		k--;
		}
		
		
		return max;
		
	}
	
	public static void main(String[] args) {
		int[] arr = {-2,-1};
		kadenns k = new kadenns();
		int x = k.maxSubarray(arr);
		
		System.out.println(x);
	}

}
