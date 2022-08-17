package com.sorting4;

public class quickSortAlgo {
	
	
	static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void print(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	
	
	static int partition(int arr[],int l,int h) {
		
		int pivot = arr[l];
		int i=l;
		int j=h;
		
		while(i<j) {
			while(arr[i]<=pivot)i++;
			while(arr[j]>pivot)j--;
			if(i<j)swap(arr,i,j);
		}
		swap(arr,l,j);
		
		return j;
	}
	
	
	static void quickSort(int arr[],int l,int r) {
		if(l<r) {
			int pivot = partition(arr,l,r);
			quickSort(arr, l, pivot-1);
			quickSort(arr, pivot+1, r);
		}
	}
	
	
	public static void main(String[] args) {
		
		
		int arr[]=  {11,30,24,7,31,16,39,41};
		int n = arr.length;
		print(arr, n);
		
		quickSort(arr,0,n-1);
		
		print(arr, n);	
		
	}

}
