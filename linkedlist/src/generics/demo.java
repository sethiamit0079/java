package generics;

public class demo {
	
	void merge(int a[],int l,int mid,int u) {
		int i=l;
		int k =l;
		int j=mid+1;
		int[] b = new int[u+1];
		
		while(i<=mid && j<=u) {
			if(a[i]<=a[j]) {
				b[k]=a[i];
				i++;
			}else {
				b[k]=a[j];
				j++;
			}
			k++;
		}
		while(i<=mid) {
			b[k]=a[i];
			i++;k++;
		}
		while(j<=u) {
			b[k]=a[j];
			j++;k++;
		}
		
		for(k=l;k<=u;k++) {
			a[k]=b[k];
		}
		
	}
	
	void mergesort(int a[],int l,int u) {
		if(l<u) {
			int mid=(l+u)/2;
			mergesort(a,l,mid);
			mergesort(a,mid+1,u);
			merge(a,l,mid,u);
		}
	}
	
	void print(int a[],int n) {
		for(int i=0;i<n;i++) {
			System.out.print(a[i]+" ");
		}
	}
	public static void main(String[] args) {
		demo d1= new demo();
		int arr[] = {4,8,1,3,9,5};
		int n=arr.length;
		d1.mergesort(arr, 0, n-1);
		d1.print(arr, n);
		
	}

}
