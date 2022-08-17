package com.sorting2;

public class bubble {
	
	
	static void swap(int arr[],int l,int h) {
		int temp = arr[l];
		arr[l] = arr[h];
		arr[h] = temp;
	}
	
	
	//it sorts fro back 
	static void bubbleSort(int arr[]) {
		
		int n = arr.length;
		int flag=0;
		
		for(int i=0;i<n;i++)
		{    flag = 0;
			for(int j=0;j<n-1-i;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
					flag = 1;
				}
			}
			if(flag == 0)break;
		}
		
	}
	
	//it sorts from starting 
	static void selectionSort(int arr[]) {
		int n = arr.length;
		
		for(int i=0;i<n-1;i++) {
			int min = i;
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[min]) {
					min = j;
				}
			}
			
			if(min != i) {
				//System.out.println("i am ainpl");
				swap(arr, i, min);
			}
		}
		
	}
	
	static void insertionSort(int arr[]) {
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			int temp =arr[i];
			int j = i-1;
			while(j>=0 && arr[j]>temp) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1] = temp;
		}
		
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {7,4,19,8,3,1};
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		//bubbleSort(arr);
		
		//selectionSort(arr);
		
		insertionSort(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
	}

}
