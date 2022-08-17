package com.sorting3;

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
	
	
	static void quickSort(int arr[],int l,int h) {
		
		if(l<h) {
			int pivot = partition(arr,l,h);
			quickSort(arr, l, pivot-1);
			quickSort(arr, pivot+1, h);
		}
	}
	
	static int partition(int arr[],int l,int h) {
		int i=l;
		int j = h;
		int pivot = arr[l];
		while(i<j) {
			
			//*
			while(arr[i]<=pivot) {
				i++;
			}
			while(arr[j]>pivot) {
				j--;
			}
			//*
			if(i<j)swap(arr,i,j);
		}
		swap(arr,l,j);
		
		return j;
	}
	
	public static void main(String[] args) {
		
		int arr[]= {11,30,24,7,31,16,39,41};
		int n = arr.length;
		print(arr, n);
		
		quickSort(arr,0,n-1);
		
		print(arr, n);
	}
	
}
