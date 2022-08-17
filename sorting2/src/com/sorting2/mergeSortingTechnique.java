package com.sorting2;

public class mergeSortingTechnique {
	
static void  mergeSort(int arr[],int l,int h) {
		
		if(l<h) {
			int mid = (l+h)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr, mid+1, h);
			merge(arr,l,mid,h);
		}
		
	}
	
	
	static void merge(int arr[],int l,int mid,int h) {
		
		
	int i=l;
	int j=mid+1;
	int k=l;
	int[] brr = new int[h+1];
	
	while(i<=mid && j<= h) {
		if(arr[i]<= arr[j]) {
			brr[k] = arr[i];
			i++;
		}else {
			brr[k] = arr[j];
			j++;
		}
		k++;
	}
	
	while(i <= mid) {
		brr[k] = arr[i];
		k++;i++;
	}
	
	while(j <= h) {
		brr[k] = arr[j];
		k++;j++;
	}
	
	
	
	for(int z=l;z<=h;z++) {
		arr[z] = brr[z];
	}
	
		
	}
	
	static void print(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	
	
	
	public static void main(String[] args) {
		int arr[]= {11,30,24,7,31,16,39,41};
		int n = arr.length;
		mergeSort(arr,0,n-1);
		print(arr,n);
	}

}
