package demo;

public class square {
	public static void main(String[] args) {
		int a =  624;
		int x = a%10;
		int flag=0;
		
	if(x == 2 || x == 3 || x == 7 || x == 8  ) {
		System.out.println(false);
	}else {
		
		int l = 1;
		int h = a;
		
		while(l<=h) {
		int mid = l+(h-l)/2;
		int sq = mid*mid;
		if(sq == a) {
			flag=1;
			System.out.println(mid);
			break;
		}else if(sq>a) {
			h = mid-1;
		}else {
			l=mid+1;
		}
		
		}
	}
	
	if(flag == 0) {
		System.out.println(false);
	}
		
	}

}
