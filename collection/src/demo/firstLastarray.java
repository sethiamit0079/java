package demo;

public class firstLastarray {
	public static int binsrc(int nums[],int l,int h,int target,int toggle) {
		int res=-1;
		int mid=0;
		while(l<=h) {
		
			 mid=l+(h-l)/2;
			if(nums[mid]>target) {
				h=mid-1;
			}else if(nums[mid]<target) {
				l=mid+1;
			}else {
				res=mid;
				if(toggle==-1) {
					h=mid-1;
				}else {
					l=mid+1;
				}
			}
			
		}
		return res;
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		int nums[]= {5,7,7,8,8,10};
		int target=8;
		int n=nums.length;
		int h=n-1;
		int l = binsrc(nums,0,h,target,-1);
		int h1 = binsrc(nums,0,h,target,+1);
		
		System.out.println(l+" "+h1);
		
	}

}
