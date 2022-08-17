package com.sorting2;

public class quickSortingTech {
	
	static void swap(int arr[],int i,int j) {
		int temp= arr[i];
		 arr[i] = arr[j];
		arr[j] = temp;
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
		swap(arr,j,l);
		return j;
	}
	
	static void quickSort(int arr[],int l,int h){
		
		if(l<h) {
		int pivot = partition(arr,l,h);
		quickSort(arr, l, pivot-1);
		quickSort(arr, pivot+1,h);
		
		}
	}
	
	static void print(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"  ");
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {4,6,2,5,7,9,1,3};
		int n = arr.length;
		print(arr,n);
		System.out.println();
		quickSort(arr,0,n-1);
		
		print(arr,n);
		
	}

}
