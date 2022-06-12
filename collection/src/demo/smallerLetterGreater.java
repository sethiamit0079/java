package demo;

public class smallerLetterGreater {
	public static void main(String[] args) {
		char[] arr = {'c','f','g','i','j','m'};
		char target = 'd';
		
		int n = arr.length;
		
		int l=0;
		int h = n-1;
		int res=0;
		int flag=0;
		
		while(l<=h) {
			int mid = l+(h-l)/2;
			
			if(arr[mid] == target) {
				res = mid+1;
				flag=1;
				break;
			}else if(arr[mid]<target) {
				l = mid+1;
			}else {
				h =mid-1;
			}
			
		}
		
		if(flag == 1) {
			System.out.println(arr[res]);
		}else {
			System.out.println(arr[l]);
		}
		
		
		
	}

}
