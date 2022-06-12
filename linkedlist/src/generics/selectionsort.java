package generics;

public class selectionsort {
		public static void main(String[] args) {
		int arr[] = {7,4,10,8,3,1};
			int n = arr.length;
for(int i=0;i<n;i++) {
	int small=i;
	for(int j=i+1;j<n;j++) {
		if(arr[j]<arr[small]) {
			small=j;
		}
	}
	if(small !=i) {
		int temp=arr[small];
		arr[small]=arr[i];
		arr[i]=temp;
	}
}

for(int i=0;i<n;i++) {
	System.out.println(arr[i]);
}
		}
}
