package com.sorting3;

import java.util.HashSet;

public class insetTwoArray {
	
	public int[] intersection(int[] nums1, int[] nums2) {
	     int n = nums1.length;
	        int m = nums2.length;
	        HashSet<Integer>set = new HashSet<>();
	        for(int i=0;i<n;i++){
	            for(int j=0;j<n;j++){
	                if(nums1==nums2){
	                    set.add(nums1[i]);
	                }
	            }
	        }
	        int o = set.size();
	        int[] arr = new int[o];
	        for(int i=0;i<o;i++){
	        	
	           // arr[i] = set.get(i);
	        }
	        return arr;
	    }
	public static void main(String[] args) {
		
	}

}
