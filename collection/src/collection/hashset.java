package collection;

import java.util.HashSet;
import java.util.Set;

public class hashset {
	public static void main(String[] args) {
		Set<Integer>set = new HashSet<>();
		int arr[] = {1,2,3,3,4,4,5,6,7,7};
		
		for(int ele:arr) {
			set.add(ele);
		}
		
		System.out.println(set.size());
		
	}

}
