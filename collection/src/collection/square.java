package collection;

public class square {
	public static void main(String[] args) {
		
	int[] nums = {-4,-1,0,3,10};
		
		 int n = nums.length;
	        int l=0;
	        int h=n-1;
	        int j=n-1;
	        int[] res= new int[n];
	        
	        while(l<=h){
	            int x = nums[l]*nums[l];
	            int y = nums[h]*nums[h];
	            
	          
	            
	            if(y>x){
	                res[j--] = y;
	                h--;
	            }else{
	                res[j--] = x;
	                l++;
	            }
	         
	        }
	        
	        for(int i=0;i<res.length;i++) {
	        	System.out.print(res[i]+" ");
	        }
		
		
	}

}
