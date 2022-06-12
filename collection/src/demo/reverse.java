package demo;

public class reverse {
	
	public static void  reverse(char[] s,int i,int e) {
		while(i<e) {
			char temp = s[i];
			s[i++] = s[e];
			s[e--] = temp;
		}
	}
	
	public static void main(String[] args) {
		
		String s = " Hello world ";
		char[] c = s.toCharArray();
		
		int n = s.length();
		int l=0,r=0;
		
		if(c[0] == ' ')
			l++;
		
		if(c[n-1] == ' ')
			n--;
		reverse(c,l,n-1);
		
		while(l<n) {
			
			
			while(r<n && c[r] != ' ') {
				r++;
			}
			reverse(c,l,r-1);
			l=r+1;
			r=l;
		}
		
		String s1 = new String(c);
		
		System.out.println(s1);
		
	}
	

}
