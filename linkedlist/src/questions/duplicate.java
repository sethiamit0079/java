package questions;

import java.util.ArrayList;
import java.util.List;

public class duplicate {
	public static void main(String[] args) {
	int nums[]= {4,3,2,7,8,2,3,1};
	List<Integer> res = new ArrayList();
	for(int n: nums) {
		n=Math.abs(n);
		if(nums[n-1]>0) {
			nums[n-1] *= -1;
		}else {
			res.add(n);
		}
	}
	
	
	for(int ele:res) {
		System.out.println(ele);
	}
	
	}

}
