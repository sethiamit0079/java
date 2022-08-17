package com.sorting4;

public class mergeSortAlgo {
	
	
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
	
	
	static void merge(int arr[],int l,int mid,int h) {
		int i=l;
		int j=mid+1;
		int k=l;
		System.out.println("l is "+k);
		int[] brr = new int[h+1];
		
		while(i<=mid && j<=h) {
			if(arr[i]<=arr[j]) {
				brr[k++] = arr[i++];
			}else {
				brr[k++]= arr[j++];
			}
		}
		
		while(i<=mid) {
			brr[k++]=arr[i++];
		}
		while(j<=h) {
			brr[k++]=arr[j++];
		}
		
		for(int z=l;z<=h;z++) {
			arr[z]=brr[z];
		}
	}
	
	static void mergeSort(int arr[],int l,int h) {
		if(l<h) {
			int mid = (l+h)/2;
			mergeSort(arr,l,mid);
			mergeSort(arr,mid+1,h);
			merge(arr,l,mid,h);
			
		}
	}
	
	public static void main(String[] args) {
		
		
		int arr[]= {10,6,2,9,5,3,4,8,1,7};
		int n = arr.length;
		print(arr, n);
		
		mergeSort(arr,0,n-1);
		
		print(arr, n);	
		
		
	}

}
