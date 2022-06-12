package ecapsulation;

import java.util.Scanner;




public class palindrome {

	public static boolean ispal(String s) {
		if( s== null) {
			return false;
		}
		
		int l=0;
		int h=s.length()-1;
		
		while(l<h) {
			if(s.charAt(l) != s.charAt(h)) {
				return false;
			}
			l++;
			h--;
		}
		
		return true;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = "abcba";
		
		if (ispal(s)) {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
		
	}

}
