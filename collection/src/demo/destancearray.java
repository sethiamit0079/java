package demo;

public class destancearray {
	public static void main(String[] args) {
		int a[] = {2,1,100,3};
		int b[] = {-5,-2,10,-3,7};
		int d=6;
		int flag=0;
		int count=0;
		
		for(int i=0;i<4;i++) {
			flag=0;
			for(int j=0;j<5;j++) {
				
			int x = Math.abs(a[i]-b[j]);	
			//System.out.println("our val is "+a[i]+" "+x);
			if(x <= d) {
				flag=1;
			}
			}
			if(flag == 0) {
				count++;
			}
			//System.out.println(count+" "+flag);
			
		}
		
		System.out.println(count);
	}

}
