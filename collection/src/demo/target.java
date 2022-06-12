package demo;

public class target {
	public static void main(String[] args) {
		int[] numbers = {2,3,4};
		int target = 6;
		 int n = numbers.length;
	        int[] arr= new int[2];
	        for(int i=0;i<n;i++){
	            for(int j=i+1;j<n;j++){
	            	int x = numbers[i]+numbers[j];
	            	System.out.println("x "+x);
	                if( x== target){
	                	System.out.println("yeas");
	                    arr[0]=i+1;
	                    arr[1]=j+1;
	                    
	                }
	            }
	        }
	        
	        System.out.println(arr[0]+ " "+arr[1]);
	}

}
