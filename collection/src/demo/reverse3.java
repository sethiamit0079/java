package demo;

public class reverse3 {
	public static void swap(char[] arr,int l,int h) {
		while(l<h) {
			char temp = arr[l];
			arr[l] = arr[h];
			arr[h] = temp;
			l++;
			h--;
		}
	}
	
	public static void main(String[] args) {
		String s = "Let's take LeetCode contest";
		char arr[] = s.toCharArray();
		int n = s.length();
		int l=0;
		int h=0;
		
		while(l<n) {
			while(h<n && arr[h] != ' ') h++;
			
			swap(arr,l,h-1);
			h++;
			l=h;
			
		}
		String s1 = String.valueOf(arr);
		System.out.println(s1);
		
		
	}
	
	
	

}
