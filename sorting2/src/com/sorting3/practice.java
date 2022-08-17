package com.sorting3;

public class practice {
	
	static void swap(int arr[],int i,int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	static void bubbleSort(int arr[],int n) {
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	static void selectionSort(int arr[],int n) {
	
		for(int i=0;i<n;i++) {
			int min = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			if(min != i) {
				swap(arr,i,min);
			}
		}
	}
	
	static void insertionSort(int arr[],int n) {
		
		for(int i=1;i<n;i++) {
			int temp = arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
	}
	
	
	
	static void print(int arr[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		
		int arr[]= {10,6,2,9,5,3,4,8,1,7};
		int n = arr.length;
		print(arr, n);
		
		//bubbleSort(arr,n);
		//selectionSort(arr,n);
		
		insertionSort(arr,n);
		
		print(arr, n);
	}

}
